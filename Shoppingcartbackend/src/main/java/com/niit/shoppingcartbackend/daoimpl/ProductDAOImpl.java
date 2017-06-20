package com.niit.shoppingcartbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartbackend.dao.ProductDAO;
import com.niit.shoppingcartbackend.model.Product;
@Transactional
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void save(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	
	public void update(Product product){
	sessionFactory.getCurrentSession().update(product);	
		
	}
	
	
	public void delete(String product_id) {
	Product productToDelete = new Product();
	productToDelete.setProduct_Id(product_id);
	sessionFactory.getCurrentSession().delete(productToDelete);
	}
	
	public List<Product> list() {
	@SuppressWarnings({ "unchecked" })
	List<Product> listCategory = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
	.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	return listCategory;
	}
	public void editProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		}
		
		
		public List<Product> search(String keyWord) {
		/*int id = Integer.parseInt(keyWord);*/
		//String hql = "from Category p where p.name like '%" + keyWord + "%' or p.description like '%"+ keyWord + "%'";
		String hql = "from Product p where p.name like '%" + keyWord + "%' or p.description like '%"+ keyWord + "%' or p.id like '%" + keyWord + "%'";
		//String hql = "SELECT * FROM Product WHERE id LIKE " + keyWord + "% OR name LIKE " + keyWord + "% OR description LIKE " + keyWord + "%";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> productList = (List<Product>) (query).list();
		return productList;
		}
		
		public Product get(String product_Id) {
		String hql = "from Product where ProductId ='" + product_Id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) (query).list();
		if (listProduct != null && !listProduct.isEmpty()) {
		return listProduct.get(0);
		}
		return null;
		}
		
		@Transactional
		public List<Product> list(String category) {
			String hql = "from Product where category='" + category + "'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Product> listProduct = (List<Product>) query.list();

			return listProduct;
		}

	
}

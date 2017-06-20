package com.niit.shoppingcartbackend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("ShippingAddressDAO")
public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	
	public ShippingAddressDAOImpl (SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}	

	@Transactional
	public List<ShippingAddress> list(String id) {
		String hql = "from ShippingAddress where id='" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> list = (List<ShippingAddress>) query.list();
		
		return list;
	}

	@Transactional
	public ShippingAddress get(String username) {
		String hql = "from ShippingAddress where username ='"+ username+"'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();
		
		if (listShippingAddress != null && !listShippingAddress.isEmpty()){
			return listShippingAddress.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
	}

	@Transactional
	public void delete(String shippingId) {
		ShippingAddress shippingAddressToDelete = new ShippingAddress();
		shippingAddressToDelete.setUsersId(shippingId);
		sessionFactory.getCurrentSession().delete(shippingAddressToDelete);
	}

	@Transactional
	public void editShippingAddress(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
		
	}

	@Override
	public ShippingAddress getByShippingId(String ShippingId) {
		String hql = "from ShippingAddress where ShippingId ='"+ ShippingId+"'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();
		
		if (listShippingAddress != null && !listShippingAddress.isEmpty()){
			return listShippingAddress.get(0);
		}
		return null;
	}

}

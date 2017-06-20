package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.model.Product;

public interface ProductDAO {
	
	public List<Product> list();
	public List<Product> list(String category);
	public Product get(String product_Id);
	public void save(Product product);
	public void update(Product product);
	public void delete(String product_Id);
	public List<Product> search(String keyWord);


}

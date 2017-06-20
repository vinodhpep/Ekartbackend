package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.model.Supplier;


public interface SupplierDAO {
	
	public void save(Supplier supplier);
	public void update(Supplier supplier);
	public List<Supplier> list();
	public Supplier get(String supplierId);
	public Supplier getMail(String email);
	public void delete(String supplierId);
	
	
	

}

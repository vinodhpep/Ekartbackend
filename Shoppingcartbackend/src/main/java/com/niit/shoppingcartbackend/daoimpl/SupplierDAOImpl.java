package com.niit.shoppingcartbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartbackend.dao.SupplierDAO;
import com.niit.shoppingcartbackend.model.Supplier;

@Repository("SupplierDAO")

public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//write user defined constructor with one parameter i.e., sessionFactory
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void save(Supplier supplier) {
		
		sessionFactory.getCurrentSession().save(supplier);
		
	}
	
	@Transactional
	public void update(Supplier supplier) {
		
		sessionFactory.getCurrentSession().update(supplier);
		
	}
	
	@Transactional
public List<Supplier> list() {
		
		
		return  sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}
	
	@Transactional
	public Supplier getMail(String email) {
		
		//get method get the date from user table based on primary key i.e., id
		// and set it to User class
		//like select * from user where id = ?
	  return 	(Supplier)  sessionFactory.getCurrentSession().get(Supplier.class, email);
		
	}
	
	@Transactional
	public Supplier get(String supplierId) {
		
		//get method get the date from user table based on primary key i.e., id
		// and set it to User class
		//like select * from user where id = ?
	  return 	(Supplier)  sessionFactory.getCurrentSession().get(Supplier.class, supplierId);
		
	}
	
	@Transactional
	public void delete(String supplierId) {
	Supplier supplierToDelete = new Supplier();
	supplierToDelete.setSupplierId(supplierId);
	sessionFactory.getCurrentSession().delete(supplierToDelete);
	}
}
package com.niit.shoppingcartbackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.SupplierDAO;
import com.niit.shoppingcartbackend.model.Supplier;

public class SupplierTest {
	@Autowired static AnnotationConfigApplicationContext context;
    
@Autowired  static SupplierDAO  supplierDAO;
	
	@Autowired  static Supplier supplier;
	
	
	//The above objects need to initialize
	/**
	 * This method is going execute before calling any one of test case
	 * and will execute only once
	 */
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		supplierDAO =  (SupplierDAO) context.getBean("SupplierDAO");
		
		//get the user from context
		
		supplier = (Supplier)context.getBean("supplier");
		
	}
	
	@Test
	public void createSupplierTest()
	{
		supplier.setSupplierName("vinodh");
		supplier.setMobileNumber("7092929290");
	    supplier.setAddress("coimbatore");
		supplierDAO.save(supplier);
		
		
	

	
		
		
	}
}

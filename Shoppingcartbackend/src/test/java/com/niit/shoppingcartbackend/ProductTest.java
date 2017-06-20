package com.niit.shoppingcartbackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.ProductDAO;
import com.niit.shoppingcartbackend.model.Product;

public class ProductTest {
	
	@Autowired static AnnotationConfigApplicationContext context;
    @Autowired static ProductDAO productDAO;
    
    @Autowired static Product product;
    
    @BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("ProductDAO");
		product = (Product) context.getBean("product");
	}
    
    @Test
    public void createProductTest()
    {
    	product.setProduct_Name("pendent");
    	product.setProduct_Price(60);
    	product.setProduct_Stock(50);
    	product.setDescription("beatiful pendents");
    	product.setSupplier_Name("sai");
    	product.setCategory("diamond");
    	
    	productDAO.save(product);
    }
		
}
package com.niit.shoppingcartbackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.CategoryDAO;

import com.niit.shoppingcartbackend.model.Category;


public class CategoryTest {
	@Autowired static AnnotationConfigApplicationContext context;
	
	@Autowired static CategoryDAO categoryDAO;
	
	@Autowired static Category category;
	
	@BeforeClass
	public static void initialize()
	{

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		//get the userDAO from context
				categoryDAO =  (CategoryDAO) context.getBean("CategoryDAO");
				
				//get the user from context
				
				category = (Category)context.getBean("category");
				
			}
	@Test
	public void createCategoryTest()
	{
		category.setName("cccc");
		category.setDescription("mankjbhvghvhnb");
		categoryDAO.save(category);
	}
}

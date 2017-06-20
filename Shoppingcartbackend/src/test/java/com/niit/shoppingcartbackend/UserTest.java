package com.niit.shoppingcartbackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.UserDAO;
import com.niit.shoppingcartbackend.model.User;

public class UserTest {
	@Autowired static AnnotationConfigApplicationContext context;
	@Autowired static UserDAO userDAO;
	@Autowired static User user;
	public UserTest() {
	initialize();
	createUserTest();
	// TODO Auto-generated constructor stub
	}
	//The above objects need to initialize
	/**
	* This method is going execute before calling any one of test case
	* and will execute only once
	*/
	@BeforeClass
	public static void initialize()
	{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcartbackend");
	context.refresh();
	//get the userDAO from context
	userDAO = (UserDAO) context.getBean("UserDAO");
	//get the user from context
	user = (User)context.getBean("user");
	}
	@Test
	public void createUserTest()
	{
	user.setUserId("123");
	user.setUserName("Ravi");
	user.setPassword("ravi12");
	user.setPhoneNumber("8807761501");
	user.setAddress("Coimbatore");
    userDAO.save(user);
	
	}
	
	

}

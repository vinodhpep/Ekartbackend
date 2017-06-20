package com.niit.shoppingcartbackend.dao;

import java.util.List;

import com.niit.shoppingcartbackend.model.User;

public interface UserDAO {

	public void save(User user);
	public void update(User user);
	public List<User>     list();
	public User get(String userId);
	public User getMail(String mailId);
	public void delete(String userId);
	
}

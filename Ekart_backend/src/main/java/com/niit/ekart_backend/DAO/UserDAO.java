package com.niit.ekart_backend.DAO;

import java.util.List;

import com.niit.ekart_backend.model.User;

public interface UserDAO {

	public void save(User user);
	public void update(User user);
	public List<User>     list();
	public User get(String user_id);
	public User getMail(String mail_id);
	public void delete(String user_id);
	
}

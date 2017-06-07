package com.niit.ekart_backend.DAO;

import com.niit.ekart_backend.model.User;

public interface CartDAO {
	
	public void save(User user);
	public void Update(User user);
	public List<Cart>     list();
	

}

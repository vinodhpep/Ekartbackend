package com.niit.ekart_backend.DAO;

import java.util.List;

import com.niit.ekart_backend.model.Bill;

public interface BillDAO {
	
	public void save(Bill bill);
	public void update(Bill bill);
	public List<Bill> list();
	public Bill get(String bill_id);

}

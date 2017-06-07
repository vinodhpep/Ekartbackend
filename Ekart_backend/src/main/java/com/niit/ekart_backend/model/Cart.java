package com.niit.ekart_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name =" Cart")
@Component

public class Cart {
	
	@Id
	@GeneratedValue
	
	private String cart_id;
	private String user_id;
	private String user_name;
	private String mailid;
	private String product_id;
	private String product_Price;
	private String quantity;
	private String total;
	private String days;
	private String Shipment_Id;
	private String Status;
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(String product_Price) {
		this.product_Price = product_Price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getShipment_Id() {
		return Shipment_Id;
	}
	public void setShipment_Id(String shipment_Id) {
		Shipment_Id = shipment_Id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	


}

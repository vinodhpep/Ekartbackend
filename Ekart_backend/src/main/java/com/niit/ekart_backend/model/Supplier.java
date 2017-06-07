package com.niit.ekart_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Supplier")
@Component

public class Supplier {
	
	@Id
	@GeneratedValue
	
	private String supplier_id;
	private String supplier_name;
	private String address;
    private int zipcode;
    private String mobile_mun;
    private String mailid;
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getMobile_mun() {
		return mobile_mun;
	}
	public void setMobile_mun(String mobile_mun) {
		this.mobile_mun = mobile_mun;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
    
    

}

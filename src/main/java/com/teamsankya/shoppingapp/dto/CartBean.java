package com.teamsankya.shoppingapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CartBean {

	@Id
	@Column(name = "product_id")
	private String productid;
	@Column(name = "product_name")
	private String productname;
	@Column(name = "product_price")
	private double price;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartBean [productid=" + productid + ", productname=" + productname + ", price=" + price + "]";
	}
	
	

}

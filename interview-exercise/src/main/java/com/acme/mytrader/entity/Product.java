package com.acme.mytrader.entity;

import lombok.Data;

@Data
public class Product {
	
	String security;
	double price;
	int volumn;
	
	public Product(String security, double price, int volumn) {
		super();
		this.security = security;
		this.price = price;
		this.volumn = volumn;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	

}

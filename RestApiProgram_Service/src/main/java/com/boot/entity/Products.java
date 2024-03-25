package com.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	private int pCode;
	private String pName;
	private int price;
	//private Date expDate;
	
	public Products() {
		
	}

	public Products(int pCode, String pName, int price) {
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Products [pCode=" + pCode + ", pName=" + pName + ", price=" + price + "]";
	}
	
		
}

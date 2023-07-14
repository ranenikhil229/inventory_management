package com.bean;

public class Product {
	
	 int pId;
	 String pName;
	 int price;
	 Catagory catagory;
	 
	 
	 
	public Product(int pId, String pName, int price, Catagory catagory) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.catagory = catagory;
	}



	public int getpId() {
		return pId;
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
	
	
	public Catagory getC() {
		return catagory;
	}
	public void setC(Catagory catagory) {
		this.catagory = catagory;
	}


	 
	
	
}

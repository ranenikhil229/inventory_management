package com.bean;

public class InventoryItem {

	int quantity;
	Product product;
	
	
	public InventoryItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}


	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}

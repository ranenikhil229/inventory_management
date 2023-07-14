package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import com.bean.Catagory;
import com.bean.InventoryItem;
import com.bean.Product;

public class InventoryManager {

	List<Product>  p = new ArrayList<>();
	List<Category>  c = new ArrayList<>();
	List<InventoryItem>  it = new ArrayList<>();
	
	
	
	// addProduct menthod
	public void addProduct(Product product)
	{
		p.add(product);
	}

	
	
	

	//  removeProduct method
	public void  removeProduct(Product product)
	{
		p.remove(product);
		for(InventoryItem item : it)
		{
			if(item.getProduct()==product)
				it.remove(product);
		}
	}
	
	
	
	// update method
	public void updateInventory(Product product, int quantity)
	{
		for(InventoryItem item:it)
		{
			if(item.getProduct() == product)
			{
				item.setQuantity(quantity);
				return;
			}
		}
		it.add(new InventoryItem(quantity, product));
	}
	
	
	
	// display method
	public void display()
	{
		for(InventoryItem item:it)
		{
			Product product = item.getProduct();
			System.out.println("Product: "+product.getpName()+ "Category:  "+product.getC().getCname()+ "Stock level: "+item.getQuantity());

		}
	}
	
	
	
	// displayTotalValue method
	public void displayTotalValue() {
		double totalvalue=0;
		for(InventoryItem item:it) {
			totalvalue=totalvalue+item.getQuantity() * item.getProduct().getPrice();
		}
		System.out.println("Total value: "+totalvalue);
	}
	
	
	
	//searchByName method
	public List<Product>searchByName(String name) {
		List<Product>matchingProducts=new ArrayList<>();
		for(Product product:p) {
			if(product.getpName().equalsIgnoreCase(name)) {
				matchingProducts.add(product);
			}
		}
		return matchingProducts;
		
	}
	
	
	// searchByCategory method
	public List<Product> searchByCategory(Catagory catagory) {
		List<Product>matchingProducts=new ArrayList<>();
		for(Product product:p) {
			if(product.getC().equals(catagory)) {
				matchingProducts.add(product);
			}
		}
		return matchingProducts;
	}




	
}

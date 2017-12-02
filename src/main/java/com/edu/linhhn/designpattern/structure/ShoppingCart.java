package com.edu.linhhn.designpattern.structure;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	private int calculateBill() {
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice();
		}
		
		return sum;
	}
	
	public void pay(PayStrategy payStrategy) {
		payStrategy.pay(calculateBill());
	}
}

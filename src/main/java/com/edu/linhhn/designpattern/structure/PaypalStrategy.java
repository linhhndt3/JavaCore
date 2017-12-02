package com.edu.linhhn.designpattern.structure;

public class PaypalStrategy implements  PayStrategy{

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("paypal");
	}

}

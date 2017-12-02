package com.edu.linhhn.designpattern.structure;

public class CreditDebitStrategy implements PayStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("credit/debit");
	}

}

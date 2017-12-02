package com.edu.linhhn.designpattern.behavior;

public class Dispense10Chain implements DispenseChain {
	private DispenseChain nextDispenseChain;

	@Override
	public void setDispenseChain(DispenseChain dispenseChain) {
		this.nextDispenseChain = dispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() > 10) {
			int remainder = currency.getAmount() % 10;
			System.out.println(remainder);
		} else {
			System.out.println(currency.getAmount());
		}
	}
}

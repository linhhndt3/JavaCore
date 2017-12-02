package com.edu.linhhn.designpattern.behavior;

public class Dispense50Chain implements DispenseChain {
	
	private DispenseChain nextDispenseChain;

	@Override
	public void setDispenseChain(DispenseChain dispenseChain) {
		this.nextDispenseChain = dispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() > 50) {
			int remainder = currency.getAmount() % 50;
			nextDispenseChain.dispense(new Currency(remainder));
		} else {
			nextDispenseChain.dispense(currency);
		}
	}

}

package com.edu.linhhn.designpattern.behavior;

public interface DispenseChain {
	void setDispenseChain(DispenseChain dispenseChain);
	void dispense(Currency currency);
}

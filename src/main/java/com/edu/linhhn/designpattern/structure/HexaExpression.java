package com.edu.linhhn.designpattern.structure;

public class HexaExpression implements Expression {
	
	private int i;
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	@Override
	public String interpreter(InterpreterContext interpreterContext) {
		// TODO Auto-generated method stub
		return interpreterContext.intToHex(i);
	}

}

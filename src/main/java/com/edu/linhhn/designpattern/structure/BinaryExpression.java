package com.edu.linhhn.designpattern.structure;

public class BinaryExpression implements Expression {
	private int i;
	
	public BinaryExpression() {
		
	}
	
	public BinaryExpression(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String interpreter(InterpreterContext interpreterContext) {
		return interpreterContext.intToBinary(this.i);
	}
	
	
}

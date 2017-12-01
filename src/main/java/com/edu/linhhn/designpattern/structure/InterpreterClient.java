package com.edu.linhhn.designpattern.structure;

public class InterpreterClient {
	private InterpreterContext interpreterContext;
	
	public InterpreterClient() {
		
	}
	
	public InterpreterClient(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}
	
	public String interpreter(String s) {
			Expression expression = new BinaryExpression(5);
			return expression.interpreter(interpreterContext);
	}
}

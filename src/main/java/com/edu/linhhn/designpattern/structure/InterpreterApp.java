package com.edu.linhhn.designpattern.structure;

public class InterpreterApp {
	public static void main(String[] args) {
		InterpreterContext interpreterContext = new InterpreterContext();
		Expression binaryExp = new BinaryExpression();
		binaryExp.interpreter(interpreterContext);
	}
}

package com.edu.linhhn.designpattern.structure;

public class InterpreterContext {
	
	public String intToBinary(Integer i) {
		return Integer.toBinaryString(i);
	}
	
	public String intToHex(Integer i) {
		return Integer.toHexString(i);
	}
	
}

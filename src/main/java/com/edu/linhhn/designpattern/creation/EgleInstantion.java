package com.edu.linhhn.designpattern.creation;

public class EgleInstantion {
	private static final EgleInstantion egS = new EgleInstantion();
	
	private EgleInstantion() {
		
	}
	
	public static EgleInstantion getEgleInstantion() {
		return egS;
	}
}

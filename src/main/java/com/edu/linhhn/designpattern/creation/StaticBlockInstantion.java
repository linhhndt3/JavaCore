package com.edu.linhhn.designpattern.creation;

public class StaticBlockInstantion {
	private static StaticBlockInstantion sbS = null;
	
	private StaticBlockInstantion() {
		
	}
	
	static {
			try{
				sbS = new StaticBlockInstantion();
			} catch(Exception e) {
				System.out.println("exception during create instance");
			}
	}
	
	public static StaticBlockInstantion getStaticBlockInstantion() {
		return sbS;
	}
}

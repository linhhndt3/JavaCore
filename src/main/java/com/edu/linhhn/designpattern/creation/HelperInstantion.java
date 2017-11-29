package com.edu.linhhn.designpattern.creation;

public class HelperInstantion {
	
	private HelperInstantion() {
		
	}
	
	private static class HelperContructInstantion {
		private static final HelperInstantion INSTANCE = new HelperInstantion();
	}
	
	public static HelperInstantion getInstance() {
		return HelperContructInstantion.INSTANCE;
	}
	
}

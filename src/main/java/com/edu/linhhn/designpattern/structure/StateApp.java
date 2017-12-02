package com.edu.linhhn.designpattern.structure;

public class StateApp {
	public static void main(String[] args) {
		State onState = new TVStartState();
		State offState = new TVStopState();
		
		TVContext onContext = new TVContext(onState);
		onContext.doAction();
		
		TVContext offContext = new TVContext(offState);
		offContext.doAction();
	}
}

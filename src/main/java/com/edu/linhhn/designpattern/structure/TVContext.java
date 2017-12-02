package com.edu.linhhn.designpattern.structure;

public class TVContext implements State {
	private State state;
	
	public TVContext() {
		
	}
	
	public TVContext(State state) {
	}
	@Override
	public void doAction() {
		state.doAction();
	}
}
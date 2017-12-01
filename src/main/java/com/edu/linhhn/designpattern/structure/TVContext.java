package com.edu.linhhn.designpattern.structure;

public class TVContext implements State {
	private State state;
	
	public TVContext() {
		
	}
	
	public TVContext(State state) {		this.state = state;
	}
	@Override
	public void doAction() {
		state.doAction();
	}
}

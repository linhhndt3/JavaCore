package com.edu.linhhn.concurrency;

public class DecCounter implements Runnable {

	private Counter counter;
	
	public DecCounter(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		counter.getC();
	}

}

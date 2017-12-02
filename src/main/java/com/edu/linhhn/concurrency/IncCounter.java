package com.edu.linhhn.concurrency;

public class IncCounter implements Runnable {
	private Counter counter;
	
	public IncCounter(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("--- inc");
		counter.inc();
	}
}

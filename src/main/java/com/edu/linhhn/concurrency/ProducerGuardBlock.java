package com.edu.linhhn.concurrency;

public class ProducerGuardBlock implements Runnable {

	private A a;

	public ProducerGuardBlock(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		while(true) {
			a.putName();
		}
	}

}

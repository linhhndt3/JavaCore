package com.edu.linhhn.concurrency;

public class ProducerGuardBlock implements Runnable {

	private A a;

	public ProducerGuardBlock(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			System.out.println(" i = " +i);
			a.putName();
		}
	}

}

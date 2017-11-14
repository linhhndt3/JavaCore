package com.edu.linhhn.concurrency;

public class ConsumerGuardBlock implements Runnable {

	private A a;

	public ConsumerGuardBlock(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		while(true) {
			a.getName();
		}
	}
}

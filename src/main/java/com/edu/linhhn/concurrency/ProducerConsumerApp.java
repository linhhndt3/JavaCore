package com.edu.linhhn.concurrency;

public class ProducerConsumerApp {
	public static void main(String[] args) {
		A a = new A();
		new Thread(new ProducerGuardBlock(a)).start();
		new Thread(new ConsumerGuardBlock(a)).start();
	}
}

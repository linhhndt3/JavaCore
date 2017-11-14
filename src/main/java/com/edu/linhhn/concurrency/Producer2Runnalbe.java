package com.edu.linhhn.concurrency;

public class Producer2Runnalbe implements Runnable {
	
	private Producer producer;
	
	public Producer2Runnalbe(Producer producer) {
		// TODO Auto-generated constructor stub
		this.producer = producer;
	}
	
	@Override
	public void run() {
		producer.m2();
	}

}

package com.edu.linhhn.concurrency;

import java.util.List;

public class Producer1Runnalbe implements Runnable {
	
	private Producer producer;
	
	public Producer1Runnalbe(Producer producer) {
		// TODO Auto-generated constructor stub
		this.producer = producer;
	}
	
	@Override
	public void run() {
		producer.m1();
		List<String> names = producer.getNames();
		names.add("A");
		names.add("B");
		producer.setNames(names);
	}

}

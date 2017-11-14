package com.edu.linhhn.concurrency;

public class LivenessProblem {
	public static void main(String[] args) {
		ProducerLiveness producer = new ProducerLiveness();
		
		new Thread(new Producer2Runnalbe(producer)).start();
		new Thread(new Producer1Runnalbe(producer)).start();
	}
}

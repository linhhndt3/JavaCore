package com.edu.linhhn.concurrency;

public class LivenessProblem {
	public static void main(String[] args) {
		Producer producer = new Producer();
		
		new Thread(new Producer2Runnalbe(producer)).start();
		new Thread(new Producer1Runnalbe(producer)).start();
	}
}

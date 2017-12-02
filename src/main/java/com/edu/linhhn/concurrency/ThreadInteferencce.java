package com.edu.linhhn.concurrency;

public class ThreadInteferencce {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Counter counter = new Counter();
		
		new Thread(new IncCounter(counter)).start();
		new Thread(new DecCounter(counter)).start();
	}
}

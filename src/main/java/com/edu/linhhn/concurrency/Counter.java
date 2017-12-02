package com.edu.linhhn.concurrency;

public class Counter {
	private int c;
	
	public void inc() {
		c++;
	}
	
	public void dec() {
		c--;
	}
	
	public void getC() {
		System.out.println("--- c value: " +c);
	}
}

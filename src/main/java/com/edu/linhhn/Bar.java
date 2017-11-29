package com.edu.linhhn;

public class Bar {
	public void mBar() {
		System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
		System.out.println("inside method of bar");
	}
}

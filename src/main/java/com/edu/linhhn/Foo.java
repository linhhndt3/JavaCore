package com.edu.linhhn;

public class Foo {
	
	private Bar bar = new Bar();
	
	public void mFoo() {
		bar.mBar();
	}
	
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.mFoo();
	}
}

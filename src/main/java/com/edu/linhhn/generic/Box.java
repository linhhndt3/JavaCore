package com.edu.linhhn.generic;

public class Box<T> {
//	private Object object;
//
//	public Object getObject() {
//		return object;
//	}
//
//	public void setObject(Object object) {
//		this.object = object;
//	}
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends Number> void inspect(U u) { // type easure -> public void inspect(Number u) // bounded type
		System.out.println("T type: " + t.getClass());
		System.out.println("U type: " + u.getClass());
	}
	
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.inspect(2);
	}
}

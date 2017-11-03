package com.edu.linhhn.collection;

import java.util.AbstractList;

public class MyArrayList<T> extends AbstractList<T>{
	
	private final T[] array;
	
	public MyArrayList(T[] array) {
		// TODO Auto-generated constructor stub
		this.array = array;
	}
	

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return array.length;
	}
	
}

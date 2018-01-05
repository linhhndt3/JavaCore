package com.edu.linhhn.generic;

import java.util.Date;
import java.util.List;

public class App {
	public static void main(String[] args) {
		System.out.println(new Date(null));
//		Box rawType = null;
//		Box<Integer> gType = new Box<Integer>();
//		rawType = gType;
////		gType = rawType;
//		
//		rawType.setT("String");
//		
//		Integer intBox = (Integer) rawType.getT();
//		System.out.println("value inside box = " + intBox);
		
		int i = 5;
		System.out.println(change(i)); // pass by value # pass by reference
	}
	
	public static int change(int i){
		System.out.println(i);
		
		i = 8;
		return i;
	}
	
	
	public void add(List<?> list) {
//		list.add(list.get(0));
		helper(list);
	}
	
	public <T> void helper(List<T> list) {
		list.add(list.get(0));
	}
	
	public void add(List<? extends Number> input, List<? super Number> output) {
		for(Number number : input) {
			output.add(number);
		}
	}
}

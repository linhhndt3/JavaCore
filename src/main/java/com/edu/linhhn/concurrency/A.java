package com.edu.linhhn.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class A {
	private List<String> names = new ArrayList<String>();
	
	private boolean isEmpty = true;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	public synchronized void putName() {
		System.out.println("------ P is empty ? " + isEmpty);
//		while(!isEmpty) {
//			try {
//				System.out.println("-------- P is waiting");
//				wait();
//				System.out.println("------- P finish wait");
//			} catch (InterruptedException e) {
//				System.out.println("I(one of the most handsome producer) can't wait for u");
//				e.printStackTrace();
//			}
//		}
		String name = UUID.randomUUID().toString();
		System.out.println("------- p produce " + name);
		names.add(name);
		isEmpty = false;
		notifyAll();
	}
	
	public synchronized void getName() {
		System.out.println("C is empty ? " + isEmpty);
		while(isEmpty) {
			try {
				System.out.println("C is waiting");
				wait();
				System.out.println("C finish waiting");
			} catch (InterruptedException e) {
				System.out.println("I(one of the most beautiful consumer) can't wait for u");
				e.printStackTrace();
			}
		}
		System.out.println(names.get(names.size() - 1));
		isEmpty = true;
		notifyAll();
	}
}

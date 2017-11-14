package com.edu.linhhn.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ProducerLiveness {
	
	private List<String> names = new ArrayList<String>();
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public synchronized void m1() {
		System.out.println("inside m1");
//		try {
//			Thread.sleep(10000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public synchronized void m2() {
		System.out.println("inside m2");
//		try {
//			Thread.sleep(10000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(names.get(1));
	}
}

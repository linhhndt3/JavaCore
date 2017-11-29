package com.edu.linhhn.designpattern.creation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LazyInstantion {
	private static LazyInstantion lzS;
	
	public static Lock lock = new ReentrantLock();

	private LazyInstantion() {

	}

	public static LazyInstantion getLazyInstantion() {
		synchronized(lock) {
			return lzS != null ? lzS : new LazyInstantion();
		}
	}
	
	public synchronized LazyInstantion getSynchronizedLazyInstantion() {
			return lzS != null ? lzS : new LazyInstantion();
	}
	
	public static LazyInstantion getLockedLazyInstatiton() {
		if(lzS == null) {
			synchronized (LazyInstantion.class) {
				if(lzS == null) {
					lzS = new LazyInstantion();
				}
			}
		}
		
		return lzS;
	}
}

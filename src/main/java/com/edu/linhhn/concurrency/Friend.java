package com.edu.linhhn.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Friend {
	public Lock lock = new ReentrantLock();
	
	private boolean impendingLock(Friend bower) {
		boolean myLock = lock.tryLock();
		boolean yourLock = bower.lock.tryLock();
		
		if(!(myLock && yourLock)) {
			if(!myLock) {
				lock.unlock();
			}
			if(!yourLock) {
				bower.lock.unlock();
			}
		}
		
		return myLock && yourLock;
	}
	
	public void bow(Friend bower) {
		
	}
}

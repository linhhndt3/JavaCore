package com.edu.linhhn.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		try {
			System.out.println("inside callable");
			Thread.sleep(5000);
			return Thread.currentThread().getName();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) throws TimeoutException {
		ExecutorService executors = Executors.newFixedThreadPool(10);
		
		Future<String> nameThread = executors.submit(new MyCallable());
		
//		FutureTask<String> taskGetNameThread = new FutureTask<String>(new MyCallable());
//		executors.submit(taskGetNameThread);
		
		System.out.println("continue synchonirours");
		try {
			System.out.println(nameThread.get());
//			System.out.println(taskGetNameThread.get());
			System.out.println("asfsdfsdfs");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executors.shutdown();
	}
	
}

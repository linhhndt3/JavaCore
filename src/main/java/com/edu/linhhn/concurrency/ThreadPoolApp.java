package com.edu.linhhn.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolApp {
	public static void main(String[] args) {
		ProducerGuardBlock producerGuardBlock = new ProducerGuardBlock(new A());
		Executor executorService = Executors.newSingleThreadExecutor();
		executorService.execute(producerGuardBlock);
	}
}

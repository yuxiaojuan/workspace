package com.yusj.firstLearning.basic.concurrency.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	private static ExecutorService threadPool = Executors.newFixedThreadPool(3);

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			threadPool.execute(new MyRunnable());
		}
	}
	
	
}

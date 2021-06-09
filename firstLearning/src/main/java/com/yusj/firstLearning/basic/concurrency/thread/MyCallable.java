package com.yusj.firstLearning.basic.concurrency.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{
	
	public Integer call() {
		int out= 1;
		System.out.println(Thread.currentThread().getName() + " is created by MyCallable");
		return out;
	}

}

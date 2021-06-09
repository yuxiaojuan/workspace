package com.yusj.firstLearning.basic.concurrency.thread;

public class MyRunnable implements Runnable{
	

	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is created by MyRunnable");
		
	}
}

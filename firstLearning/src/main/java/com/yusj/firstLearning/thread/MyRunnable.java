package com.yusj.firstLearning.thread;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is created by MyRunnable");
		
	}
}

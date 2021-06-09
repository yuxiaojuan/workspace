package com.yusj.firstLearning.basic.concurrency.synchronize;

public class MyThread implements  Runnable {
	

	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

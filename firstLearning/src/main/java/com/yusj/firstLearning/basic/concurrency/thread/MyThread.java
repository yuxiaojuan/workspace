package com.yusj.firstLearning.basic.concurrency.thread;

public class MyThread extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is created by MyThread");
	}
}

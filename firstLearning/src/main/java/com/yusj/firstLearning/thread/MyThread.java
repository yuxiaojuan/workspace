package com.yusj.firstLearning.thread;

public class MyThread extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is created by MyThread");
	}
}
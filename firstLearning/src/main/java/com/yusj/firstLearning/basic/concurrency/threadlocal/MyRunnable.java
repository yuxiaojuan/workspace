package com.yusj.firstLearning.basic.concurrency.threadlocal;

public class MyRunnable implements Runnable{
	
//	private ThreadLocalDemo threadLocalDemo;
//	
//	public MyRunnable(ThreadLocalDemo threadLocalDemo) {
//		this.threadLocalDemo = threadLocalDemo;
//	}
	
	public void run() {
		String threadCurrentName = Thread.currentThread().getName();
		System.out.println(threadCurrentName + "is running.");
		
		for(int j=0;j<5;j++) {
			System.out.println(threadCurrentName + "get number:" +ThreadLocalDemo.getNextNum());
		}
		ThreadLocalDemo.remove();
	}

}

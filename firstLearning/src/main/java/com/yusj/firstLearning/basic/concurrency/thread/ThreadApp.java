package com.yusj.firstLearning.basic.concurrency.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadApp {

	public static void main(String[] args) {
		MyRunnable t1 = new MyRunnable();
		new Thread(t1,"Runnable线程1").start();
		new Thread(t1,"Runnable线程2").start();
		
		MyThread t2 = new MyThread();
		new Thread(t2,"Thread线程1").start();
		new Thread(t2,"Thread线程2").start();
		
		MyCallable t3 = new MyCallable();
		FutureTask<Integer> rTask = new FutureTask<Integer>(t3);
		FutureTask<Integer> rTask2 = new FutureTask<Integer>(t3);
		new Thread(rTask,"Callable线程1").start();
		new Thread(rTask2,"Callable线程2").start();
		try {
			System.out.println(rTask.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

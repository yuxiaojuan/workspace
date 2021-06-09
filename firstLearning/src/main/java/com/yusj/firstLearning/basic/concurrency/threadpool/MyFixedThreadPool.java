package com.yusj.firstLearning.basic.concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yusj.firstLearning.basic.concurrency.thread.MyCallable;

public class MyFixedThreadPool {

	int taskSize = 5;
	ExecutorService threadPool = Executors.newFixedThreadPool(taskSize);
	
	MyCallable test1 = new MyCallable();
	
}

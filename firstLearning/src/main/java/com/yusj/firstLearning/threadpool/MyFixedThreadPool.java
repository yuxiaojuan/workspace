package com.yusj.firstLearning.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.yusj.firstLearning.thread.MyCallable;

public class MyFixedThreadPool {

	int taskSize = 5;
	ExecutorService threadPool = Executors.newFixedThreadPool(taskSize);
	
	MyCallable test1 = new MyCallable();
	
}

package com.yusj.firstLearning.basic.concurrency.threadlocal;

/**
 * ThreadLocal测试
 * @author yusj
 *
 */
public class ThreadLocalDemo{

	private final static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		@Override
		public Integer initialValue() {
			return 5;
		}
	};
	
	
	
//	public static void main(String[] args) {
//		for(int i=0;i<3;i++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					threadLocal.set(5);
//					String threadCurrentName = Thread.currentThread().getName();
//					System.out.println(threadCurrentName + "is running.");
//					for(int j=0;j<5;j++) {
//						System.out.println(threadCurrentName + "get number:" +getNextNum());
//					}
//				}
//			}).start();;
//		}
//	}
	public static int getNextNum() {
		threadLocal.set(threadLocal.get()+1);
		return threadLocal.get();
	}
	
	public static void remove() {
		threadLocal.remove();
	}
}


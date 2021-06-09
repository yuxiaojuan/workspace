package com.yusj.firstLearning;

import com.yusj.firstLearning.basic.concurrency.thread.MyRunnable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      for(int i = 0;i<10;i++) {
    	  Runnable runnable = new MyRunnable();
          Thread thread = new Thread(runnable);
          thread.start();
          thread.run();
      }
      
    }
}

package com.yusj.firstLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.yusj.firstLearning.synchronize.AlertRule;
import com.yusj.firstLearning.thread.MyRunnable;

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
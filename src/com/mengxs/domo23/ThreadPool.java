package com.mengxs.domo23;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ExecutorService es=Executors.newCachedThreadPool();
			ScheduledExecutorService ses=Executors.newScheduledThreadPool(10);
			es.execute(new Thread());
			
	}

}

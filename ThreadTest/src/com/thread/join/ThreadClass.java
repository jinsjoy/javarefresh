package com.thread.join;

class ThreadTask implements Runnable{
	 
	 public ThreadTask() {}
	  
	 public ThreadTask(Thread threadToJoin) {
	  try {
	   threadToJoin.join();
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }
	  
	 @Override
	 public void run() {
	  System.out.println("Start Thread :"+Thread.currentThread().getName());  
	  try {
	   Thread.sleep(5000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	  System.out.println("End Thread :"+Thread.currentThread().getName());
	 } 
	}

package com.thread.join;

public class ThreadDemo {
	  
	 public static void main(String ar[]){
	  System.out.println("Inside Main Thread");
	   
	  Thread thread1 = new Thread(new ThreadTask());
	  thread1.start();
	   
	  Thread thread2 = new Thread(new ThreadTask(thread1));
	  thread2.start();
	   
	  Thread thread3 = new Thread(new ThreadTask());
	  thread3.start();
	    
	  try {
	   thread1.join();
	   //thread2.join();
	   thread3.join();
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	  System.out.println("End of Main Thread");  
	 }
	}
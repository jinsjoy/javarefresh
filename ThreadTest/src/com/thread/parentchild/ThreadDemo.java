package com.thread.parentchild;

public class ThreadDemo {
	public static void main(String args[])
	{
		System.out.println("Inside Main Thread");
		Thread thread = new Thread(new ThreadTask());
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();}
		System.out.println("End of Main Thread"); 
	}
}
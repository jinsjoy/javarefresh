package com.thread.test;

import java.util.concurrent.Callable;

public class ThreadTask implements Callable<Result> {
	  
	 //method where the thread execution takes place
	 public Result call() {
	  //Code present here will be executed in separate independent path.   
	  Result response = new Result();
	  response.code = 200;
	  response.message = "SUCCESS";
	  return response;
	 }
	  
	}

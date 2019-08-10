package com.design.singleton;

public class SingleTonObject {
	
	private SingleTonObject() {
		
	}
	private static SingleTonObject singleTon = new SingleTonObject();
	
	public static SingleTonObject getInstance() {
		return singleTon;	
	}
	
	public void showMessage()
	{
	 System.out.println("Hello World");
	}

}

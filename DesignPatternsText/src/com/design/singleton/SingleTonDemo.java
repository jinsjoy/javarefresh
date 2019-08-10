package com.design.singleton;

public class SingleTonDemo {
	
	public static void main(String args[]) {
	SingleTonObject singleTons = SingleTonObject.getInstance();
	
	singleTons.showMessage();
	}

}

package com.design.decorator;

public class Expresso extends Beverage {
	
	//public String description;
	
	public Expresso() {
		description = "Expresso";
	}
	
	public double cost() {
		return 2.99;
	}

}

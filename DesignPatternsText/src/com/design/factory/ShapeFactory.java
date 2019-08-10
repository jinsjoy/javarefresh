package com.design.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		} else if(shapeType == "circle") {
			return new Circle();
		} else if(shapeType == "square") {
			return new Square();
		} else if(shapeType == "rectangle") {
			return new Rectangle();
		}
		
		return null;
	}
	

}

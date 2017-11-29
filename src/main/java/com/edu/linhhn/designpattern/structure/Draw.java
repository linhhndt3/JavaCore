package com.edu.linhhn.designpattern.structure;

import java.util.ArrayList;
import java.util.List;

public class Draw implements Shape {
	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String color) {
		for(Shape shape : shapes) {
			shape.draw(color);
		}
		
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
}

package com.edu.linhhn.designpattern.structure;

public class Triangle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("draw triangle with color " + color);
	}
	
}

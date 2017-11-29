package com.edu.linhhn.designpattern.structure;

public abstract class ShapeBridge {
	
	private Color color;
	
	public ShapeBridge() {
		
	}
	
	public ShapeBridge(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
	
}

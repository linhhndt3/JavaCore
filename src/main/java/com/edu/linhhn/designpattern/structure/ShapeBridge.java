package com.edu.linhhn.designpattern.structure;

public abstract class ShapeBridge {
	
	private Color color;
	
	public ShapeBridge() {
		
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}



	public ShapeBridge(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
	
}

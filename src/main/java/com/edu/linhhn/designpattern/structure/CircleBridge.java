package com.edu.linhhn.designpattern.structure;

public class CircleBridge extends ShapeBridge{

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		getColor().draw();
	}

}

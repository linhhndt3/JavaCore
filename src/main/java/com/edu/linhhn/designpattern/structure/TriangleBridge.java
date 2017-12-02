package com.edu.linhhn.designpattern.structure;

public class TriangleBridge extends ShapeBridge {

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		getColor().draw();
	}

}

package com.edu.linhhn.designpattern.structure;

import com.sun.xml.internal.bind.api.Bridge;

public class CircleBridge extends ShapeBridge{

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		getColor().draw();
	}

}

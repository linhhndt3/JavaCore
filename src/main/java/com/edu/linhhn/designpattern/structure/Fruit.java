package com.edu.linhhn.designpattern.structure;

public class Fruit implements ItemElement {

	@Override
	public void visit(ShopcartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}

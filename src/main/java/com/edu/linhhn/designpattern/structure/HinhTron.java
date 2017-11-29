package com.edu.linhhn.designpattern.structure;

import java.awt.Color;
import java.awt.Graphics;

public class HinhTron implements HinhDang {

	@Override
	public void draw(Graphics circle, int x, int y, Color color) {
		// TODO Auto-generated method stub
		circle.setColor(color);
		circle.drawOval(1, 2, 3, 4);
	}

}

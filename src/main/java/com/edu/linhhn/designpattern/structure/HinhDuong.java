package com.edu.linhhn.designpattern.structure;

import java.awt.Color;
import java.awt.Graphics;

public class HinhDuong implements HinhDang {

	@Override
	public void draw(Graphics g, int x, int y, Color color) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine(1, 2, 3, 4);
	}

}

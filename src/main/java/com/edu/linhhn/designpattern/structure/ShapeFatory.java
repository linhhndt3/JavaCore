package com.edu.linhhn.designpattern.structure;

import java.util.HashMap;
import java.util.Map;

public class ShapeFatory {
	private Map<Integer, HinhDang> shapes = new HashMap<Integer, HinhDang>();
	
	public HinhDang getShape(int type) {
		HinhDang shape = shapes.get(type);
		if(shape == null) {
			if(type == 1) {
				shape = new HinhDuong();
				shapes.put(type, shape);
			} else if(type == 2) {
				shape = new HinhTron();
				shapes.put(type, shape);
			}
		}
		
		return shape;
	}
}

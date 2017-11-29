package com.edu.linhhn.designpattern.structure;

public class Socket {
	
	public Volt gen120V() {
		Volt volt = new Volt();
		volt.setVolt(120);
		return volt;
	}
	
}

package com.edu.linhhn.designpattern.creation;

public class ComputerFactory {
	public static Computer buildComputer(Factory factory) {
		return factory.getComputer();
	}
}

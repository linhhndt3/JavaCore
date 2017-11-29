package com.edu.linhhn.designpattern.creation;

public class CreationalApp {
	public static void main(String[] args) {
//		Computer computer = ComputerFactory.buildComputer("pc", "corei7", "32", "512");
		Computer pc = ComputerFactory.buildComputer(new PCFactory());
		System.out.println(pc);
		Computer server = ComputerFactory.buildComputer(new ServerFactory());
		System.out.println(server);
		
	}
}

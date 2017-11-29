package com.edu.linhhn.designpattern.creation;

public class ServerFactory implements Factory {
	
	private String cpu;
	
	private String ram;
	
	private String mem;

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return new Server(cpu, ram, mem);
	}

}

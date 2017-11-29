package com.edu.linhhn.designpattern.creation;

public class PCFactory implements Factory {
	
	private String cpu;
	
	private String ram;
	
	private String mem;
	
	public PCFactory() {
		
	}
	
	public PCFactory(String cpu, String ram, String mem) {
		// TODO Auto-generated constructor stub
		this.cpu = cpu;
		this.ram = ram;
		this.mem = mem;
		
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return new PC(cpu, ram, mem);
	}

}

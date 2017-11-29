package com.edu.linhhn.designpattern.creation;

public class PC extends Computer {

	private String cpu;
	
	private String ram;
	
	private String mem;
	
	public PC() {
		
	}
	
	public PC(String cpu, String ram, String mem) {
		// TODO Auto-generated constructor stub
		this.cpu = cpu;
		this.ram = ram;
		this.mem = mem;
		
	}
	
	@Override
	public Computer buildComputer() {
		System.out.println("buil PC");
		Computer computer = new PC();
		computer.setCpu("pcCpu");
		computer.setMem("pcMem");
		
		return computer;
	}

}

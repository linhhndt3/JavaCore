package com.edu.linhhn.designpattern.creation;

public class Server extends Computer {
	
	private String cpu;
	
	private String ram;
	
	private String mem;
	
	public Server() {
		
	}
	
	public Server(String cpu, String ram, String mem) {
		// TODO Auto-generated constructor stub
		this.cpu = cpu;
		this.ram = ram;
		this.mem = mem;
		
	}
	
	@Override
	public Computer buildComputer() {
		System.out.println("buil Server");
		Computer computer = new Server();
		computer.setCpu("svCpu");
		computer.setMem("svMem");
		computer.setRam("svRam");
		
		return computer;
	}

}

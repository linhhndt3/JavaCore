package com.edu.linhhn.designpattern.creation;

public abstract class Computer {

	private String cpu;
	
	private String ram;
	
	private String mem;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMem() {
		return mem;
	}

	public void setMem(String mem) {
		this.mem = mem;
	}
	
	public abstract Computer buildComputer();

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", mem=" + mem
				+ "]";
	}
	
}

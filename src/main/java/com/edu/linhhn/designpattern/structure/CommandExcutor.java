package com.edu.linhhn.designpattern.structure;

public class CommandExcutor implements Command {

	@Override
	public void run(String cmd) {
		System.out.println("run cmd");
	}

}

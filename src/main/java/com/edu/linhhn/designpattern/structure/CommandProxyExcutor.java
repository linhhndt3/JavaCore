package com.edu.linhhn.designpattern.structure;

public class CommandProxyExcutor implements Command {
	
	private String userName;
	
	private String password;
	
	private CommandExcutor commandExcutor;
	
	public CommandProxyExcutor() {
		// TODO Auto-generated constructor stub
	}
	
	public CommandProxyExcutor(String userName, String password) {
		
	}
	
	@Override
	public void run(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if("admin".equals(userName) && "123456".equals(password)) {
			commandExcutor.run(cmd);
		} else {
			throw new Exception("Access is denied");
		}
		
	}

}

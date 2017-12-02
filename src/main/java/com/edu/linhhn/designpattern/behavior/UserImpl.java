package com.edu.linhhn.designpattern.behavior;

public class UserImpl extends User {
	
	public UserImpl() {
	}
	
	public UserImpl(ChatMediator chatMediator) {
		super(chatMediator);
	}

	@Override
	public void sendMess(String message) {
		getChatMediator().sendMessage(message, this);
	}

	@Override
	public void receiveMess(String message, User user) {
		// TODO Auto-generated method stub
		System.out.println("user " + this + " have already get message " + message + "from user " + user);
	}

}

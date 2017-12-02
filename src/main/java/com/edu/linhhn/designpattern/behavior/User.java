package com.edu.linhhn.designpattern.behavior;

public abstract class User {
	
	private ChatMediator chatMediator;
	
	public User() {
		
	}
	
	public User(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}
	
	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public abstract void sendMess(String message);
	
	public abstract void receiveMess(String message, User user);
	
}

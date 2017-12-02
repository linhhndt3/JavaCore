package com.edu.linhhn.designpattern.behavior;

public class MediatorApp {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ConcreteChatMediator();
		
		User user1 = new UserImpl(chatMediator);
		User user2 = new UserImpl(chatMediator);
		User user3 = new UserImpl(chatMediator);
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		
		user1.sendMess("Hello room");
		user2.sendMess("hi");
	}
}

package com.edu.linhhn.designpattern.behavior;

public interface ChatMediator {
	void addUser(User user);
	void sendMessage(String message, User user);
}

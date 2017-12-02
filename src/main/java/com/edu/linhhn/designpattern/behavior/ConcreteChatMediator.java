package com.edu.linhhn.designpattern.behavior;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator implements ChatMediator {

	private List<User> userList = new ArrayList<>();
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		// TODO Auto-generated method stub
		for(User userr : userList) {
			if(user != userr) {
				userr.receiveMess(message, user);
			}
		}
	}

}

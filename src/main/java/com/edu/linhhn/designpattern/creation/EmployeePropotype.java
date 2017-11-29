package com.edu.linhhn.designpattern.creation;

import java.util.ArrayList;
import java.util.List;

public class EmployeePropotype implements Cloneable {
	
	private List<String> names;
	
	public EmployeePropotype() {
		
	}
	
	public EmployeePropotype(List<String> names) {
		this.names = names;
	}
	
	@Override
	public Object clone() {
		List<String> cloneNames = new ArrayList<String>();
		for(String name : names) {
			cloneNames.add(name);
		}
		
		return new EmployeePropotype(cloneNames);
	}
}

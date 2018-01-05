package com.edu.interview;

import java.util.ArrayList;
import java.util.List;

public class CustomArray<T extends Number> implements CustomIterator<T>{
	
	private List<T> numbers = new ArrayList<T>();
	
	private int index;
	
	public CustomArray() {
		
	}

	public CustomArray(List<T> numbers) {
		this.numbers = numbers;
	}

	@Override
	public CustomIterator<T> getIte() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(numbers.get(index).intValue() > 5) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return numbers.get(index++);
	}
	

}

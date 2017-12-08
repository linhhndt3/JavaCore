package com.edu.linhhn.poolObject;
import com.edu.linhhn.poolObject.Parse;


public class XmlParse<E, T> implements Parse<E, T>{

	private E e;
	
	private T t;
	
	@Override
	public void parse(E element, T result) {
		// TODO Auto-generated method stub
		System.out.println("parsing");
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		System.out.println("is validate ?");
		return true;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		System.out.println("reset state ");
	}

}

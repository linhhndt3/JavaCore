package com.edu.linhhn.poolObject;

public interface Parse<E, T> {
	void parse(E element, T result);
	boolean isValid();
	void reset();
}

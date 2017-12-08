package com.edu.interview;

public interface CustomIterator<T> {
	CustomIterator<T> getIte();
	boolean hasNext();
	T next();
}

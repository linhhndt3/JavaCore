package com.edu.linhhn.designpattern.structure;

public interface ShopcartVisitor {
	void visit(Book book);
	void visit(Fruit fruit);
}

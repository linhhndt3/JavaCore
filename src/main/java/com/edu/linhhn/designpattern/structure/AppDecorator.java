package com.edu.linhhn.designpattern.structure;

public class AppDecorator {
	public static void main(String[] args) {
		Car sportCar1 = new SportCar(new BasicCar());
		sportCar1.assemble();
		Car sportCar2 = new SportCar(new LuxuryCar(new BasicCar()));
		sportCar2.assemble();
	}
}

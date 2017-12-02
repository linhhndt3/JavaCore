package com.edu.linhhn.designpattern.structure;

public class LuxuryCar extends DecoratorCar {
	
	public LuxuryCar() {
		
	}
	
	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		System.out.println("adding feature for luxurycar");
		getCar().assemble();
	}
}

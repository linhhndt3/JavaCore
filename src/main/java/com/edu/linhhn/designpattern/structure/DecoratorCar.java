package com.edu.linhhn.designpattern.structure;

public class DecoratorCar implements Car {
	
	private Car car;
	
	public DecoratorCar() {
		// TODO Auto-generated constructor stub
	}
	
	public DecoratorCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		car.assemble();
	}

}

package com.edu.linhhn.designpattern.structure;

public class SportCar extends DecoratorCar {
		public SportCar() {
			
		}
		
		public SportCar(Car car) {
			super(car);
		}
		
		@Override
		public void assemble() {
			System.out.println("adding feature to sport car");
			System.out.println("car: " + getCar());
			getCar().assemble();
		}
}

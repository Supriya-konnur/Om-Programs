package com.xworkz.cosmetic.coupling;

public class Driver {
	private String name;
	private Vehicle vehicle;

	public Driver(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}

	public void drive() {
		System.out.println("driving by " + this.name);
		this.vehicle.move();
	}
}

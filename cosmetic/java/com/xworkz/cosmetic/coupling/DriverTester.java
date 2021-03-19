package com.xworkz.cosmetic.coupling;

public class DriverTester {

	public static void main(String[] args) {
		Vehicle vehicle = new ScootyVehicle();
		Driver driver = new Driver("vara", vehicle);
		driver.drive();
	}

}

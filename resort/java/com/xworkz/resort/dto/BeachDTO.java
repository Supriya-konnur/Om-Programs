package com.xworkz.resort.dto;

public class BeachDTO implements Comparable<BeachDTO> {

	private String name;
	private int noOfResorts;
	private int iceLand;

	public BeachDTO() {
	}

	public BeachDTO(String name, int noOfResorts, int iceLand) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
		this.iceLand = iceLand;
	}

	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compare to by name");
		int tempCompare = this.name.compareTo(o.getName());

		//int tempCompare=o.name.compareTo(this.getName());
		System.out.println(tempCompare);
		return tempCompare;
	}

	// @Override
	public int compareToResort(BeachDTO o) {
		System.out.println("invoked compareTO");
		// 1 greater , 0 equal , -1 less than

		if (this.noOfResorts == o.noOfResorts) {
			System.out.println("equal " + noOfResorts);
			return 0;
		}

		if (this.noOfResorts > o.noOfResorts) {
			System.out.println("greater " + noOfResorts);
			return 100;
		}
		if (this.noOfResorts < o.noOfResorts) {
			System.out.println("lesser " + noOfResorts);
			return -10;
		}
		return 0;
	}

	public String getName() {
		return name;
	}

	public int getNoOfResorts() {
		return noOfResorts;
	}

	public int getIceLand() {
		return iceLand;
	}

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResorts=" + noOfResorts + ", iceLand=" + iceLand + "]";
	}

}

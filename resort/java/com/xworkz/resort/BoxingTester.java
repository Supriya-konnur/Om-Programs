package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

public class BoxingTester {

	public static void main(String[] args) {
		Integer age = 24;// auto boxing
		Double salary = new Double(550);
		double convertedSal = salary;// auto un boxing

		List<Integer> ageList = new ArrayList<Integer>();
		int supriyaAge = 23;
		int madhiAge = 24;
		int mamataAge = 23;

		ageList.add(supriyaAge);
		ageList.add(madhiAge);
		ageList.add(mamataAge);

		List<Integer> copyOfAgeList = new ArrayList<Integer>();

		copyOfAgeList.addAll(ageList);

		copyOfAgeList.add(24);
		copyOfAgeList.add(23);
		copyOfAgeList.add(25);
		copyOfAgeList.add(23);
		copyOfAgeList.add(22);

		System.out.println("copyOfAgeList " + copyOfAgeList.size());

		List<Integer> removeAgeList = new ArrayList<Integer>();

		removeAgeList.add(23);
		removeAgeList.add(22);
		removeAgeList.add(21);

		boolean containall = copyOfAgeList.containsAll(removeAgeList);

		System.out.println("containall "
				+ "" + containall);
		copyOfAgeList.removeAll(removeAgeList);
		System.out.println("copyOfAgeList after removeall " + copyOfAgeList.size());
		System.out.println(copyOfAgeList.size());
		System.out.println(copyOfAgeList);
	}

}

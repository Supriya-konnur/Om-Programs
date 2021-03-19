package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTester {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList<String>();

		names.add("Omkar");
		names.add("Nikunj");
		names.add("Drone");
		names.add("Akshar");
		names.add("Devendra");

		// for each

		// for(Type ref:collection)
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Drone")) {
				// names.remove(name);
				System.out.println("cannot remove parallely");
			}
		}
		System.out.println("size before removing drone" + names.size());
		// iterator
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();// Omkar,Nikunj,Drone,Akshar,Deve
			if (name.equals("Drone"))// Akshar
			{
				iterator.remove();
			}
		}
		System.out.println(names);
		System.out.println("size after removing drone" + names.size());
	}

}

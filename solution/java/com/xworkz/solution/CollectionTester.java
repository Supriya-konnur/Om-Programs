package com.xworkz.solution;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionTester {

	public static void main(String[] args) {
		
				String cadbury = "eclairs";
				String nestle = "Kitkat";
				String campco = "MilkyBar";
				String parle = "Kiss me";
				String amul = "Dark Chocolate";
				
				Collection chocolates = new ArrayList();
				boolean added = false;
				added = chocolates.add(campco);
				System.out.println(added);
				added = chocolates.add(nestle);
				System.out.println(added);
				added = chocolates.add(cadbury);
				System.out.println(added);
				added = chocolates.add(amul);
				System.out.println(added);
				added = chocolates.add(parle);
				System.out.println(added);

				int totalElements = chocolates.size();
				System.out.println("totalElements: " + totalElements);

				String hersheys = "hersheys kiss";
				boolean removed = chocolates.remove(null);
				System.out.println("Removed : " + removed);
				String ref = null;
				if (ref != null) {
					System.out.println(ref.toString());
					// return true;
				}
				added = chocolates.add(null);
				System.out.println("added null:" + added);
				added = chocolates.add(null);
				System.out.println("added null:" + added);
				// else return false;
				totalElements = chocolates.size();
				System.out.println("totalElements: " + totalElements);

				// chocolates.clear();
				chocolates.add(parle);
				totalElements = chocolates.size();
				System.out.println("totalElements after adding duplicate: " + totalElements);
				chocolates.remove(parle);
				chocolates.remove(parle);
				totalElements = chocolates.size();
				System.out.println("totalElements: " + totalElements);

				// List chocolateList = new ArrayList();

				System.out.println("looping chocolates");

				Object[] convertedChocolates = chocolates.toArray();
				for (int i = 0; i < convertedChocolates.length; i++) {
					System.out.println(convertedChocolates[i]);
				}

				System.out.println("looping using iterator");

				Iterator iterator = chocolates.iterator();
				//hasNext(),next();remove();
				System.out.println("element present");
				while (iterator.hasNext()) {
					
					Object str = iterator.next();
					System.out.println(str);

				}

			}

		

	}



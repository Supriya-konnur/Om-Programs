package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FoodItems {

	public static void main(String[] args) {
		String s1 = "Dosa";
		String s2 = "Idli";
		String s3 = "Vada";
		String s4 = "Palav";
		String s5 = "Puri";

		Collection<String> fooditem = new ArrayList();
		fooditem.add(s1);
		fooditem.add(s2);
		fooditem.add(s3);
		fooditem.add(s4);
		fooditem.add(s5);
		
		//String seachItem = "Puri";
		
		for (String string : fooditem) {
			System.out.println(string);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter food item");

			String seachItem=sc.next();

			if (string.equals(seachItem)) {
				System.out.println("dosa is present");
			}
		}

	}

}

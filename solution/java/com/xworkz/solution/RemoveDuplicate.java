package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Collection<Integer> rd = new ArrayList<Integer>();
		rd.add(1);
		rd.add(2);
		rd.add(4);
		rd.add(6);
		rd.add(1);
		rd.add(3);
		rd.add(4);
		rd.add(2);
		rd.add(1);
		
		System.out.println("Before remove the duplicates:" +rd);
		
		//to remove duplicate from the collection we can use Set
		
		Collection<Integer> set  = new  LinkedHashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(1);
		System.out.println("after remove  the duplicates:" +set);
	}

}

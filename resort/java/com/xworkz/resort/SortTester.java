package com.xworkz.resort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.resort.sort.GarageComparator;

public class SortTester {

	public static void main(String[] args) {
		
		List<String> garageToolList = new ArrayList();
		
		garageToolList.add("spanner");
		garageToolList.add("screw Driver");
		garageToolList.add("cutting plier");
		garageToolList.add("hammer");
		garageToolList.add("nut");
		garageToolList.add("bolt");
		garageToolList.add("jack");
		garageToolList.add("air pump");
		garageToolList.add("gun");
		garageToolList.add("mechanic");
		
		GarageComparator comp=new GarageComparator();
		Collections.sort(garageToolList,comp);
		
		for (String toolSorted : garageToolList) {
			System.out.println(toolSorted);
		}

	}

}

package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class TaskTester {

	public static void main(String[] args) {
		
		Collection<Long> doorNos = new ArrayList();

		doorNos.add(115L);
		doorNos.add(420L);
		doorNos.add(840L);
		doorNos.add(420L);
		doorNos.add(100L);
		doorNos.add(31L);
		doorNos.add(420L);
		doorNos.add(31L);
		doorNos.add(729L);
		doorNos.add(370L);
		doorNos.add(370L);
		
		
		// convert to []
		// iterator

		Collection<Long> tempDoorNos = new ArrayList<Long>();
		//tempDoorNos.addAll(doorNos);
		tempDoorNos.add(729l);
		tempDoorNos.add(370l);
		tempDoorNos.add(370l);
		
		Collection<Long> doorNos2 = new ArrayList();
		
		doorNos2.add(370l);
		
		tempDoorNos.removeAll(doorNos2);
		
	System.out.println(tempDoorNos.size());
	}

}

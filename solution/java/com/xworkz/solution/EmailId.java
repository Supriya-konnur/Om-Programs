package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//import com.xworkz.java_programs.collection_programs.list.set.TreeSet.comparator.student_ID_Name.Student;

public class EmailId {

	public static void main(String[] args) {
		
		Collection emailids = new ArrayList();
		emailids.add("supriya.xworkz@gmail.com");
		emailids.add("soubhagya.xworkz@gmail.com");
		emailids.add("mamata.xworkz@gmail.com");
		emailids.add("naheeda.xworkz@gmail.com");
		emailids.add("shrinivas.xworkz@gmail.com");
		emailids.add("usha.xworkz@gmail.com");
		emailids.add("rohitkonnur@gmail.com");
		emailids.add("shwethakonnur@gmail.com");
		emailids.add("supriya.xworkz@gmail.com");
		emailids.add("rameshkonnur@gmail.com");
		emailids.add("naheeda.xworkz@gmail.com");
		emailids.add("rameshkonnur@gmail.com");
		emailids.add("prakshkonnur@gmail.com");
		emailids.add("sachine@gmail.com");
		emailids.add("shashikonnur@gmail.com");
		emailids.add("jyothi@gmail.com");
		emailids.add("megha@gmail.com");
		emailids.add("jyoti@gmail.com");
		emailids.add("rohitkonnur@gmail.com");
		emailids.add("madhu@gmail.com");
		emailids.add("soumya@gmail.com");
		emailids.add("usha.xworkz@gmail.com");
		emailids.add("mamata.xworkz@gmail.com");
		emailids.add("madhu@gmail.com");
		
		
		Iterator iterator = emailids.iterator();
		while(iterator.hasNext()) {
			Object str = iterator.next();
			System.out.println(str);	
		}
		System.out.println();
		System.out.println("duplicate Emails:");
		
		
		
		
		
		
		

	}

}

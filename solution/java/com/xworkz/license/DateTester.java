package com.xworkz.license;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTester {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
		String stringDate=format.format(date);
		System.out.println(stringDate);
		
		SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
		
//		Date date2=format2.parse("16-03-1996");
//		System.out.println(date2);
	}

}

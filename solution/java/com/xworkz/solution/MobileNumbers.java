package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class MobileNumbers {

	public static void main(String[] args) {
		
		
		Collection<Long> mobileNumbers = new ArrayList();
		mobileNumbers.add(7795314634L);
		mobileNumbers.add(9482293420L);
		mobileNumbers.add(8217048038L);
		mobileNumbers.add(9448393996L);
		mobileNumbers.add(9663775039L);
		mobileNumbers.add(7204602155L);
		mobileNumbers.add(7892137730L);
		mobileNumbers.add(8884923476L);
		mobileNumbers.add(9886971483L);
		mobileNumbers.add(7259929818L);
		
//		Iterator iterator = mobileNumbers.iterator();
//		System.out.println("mobileNumbers which are greater than 3: ");
//		
//		while(iterator.hasNext()) {
//			long a = (long)iterator.next();
//			if(a % 10 > 3) {
//				System.out.println(a);
//			}
		
		for (Long mobileNo : mobileNumbers) {

			String convertedMobileNo = mobileNo.toString();
			Character last = convertedMobileNo.charAt(convertedMobileNo.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile number is greater" + convertedMobileNo);
			}
		}
		}
	}



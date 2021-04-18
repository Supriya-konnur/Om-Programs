package com.xworkz.resort.sort;

import java.util.Comparator;
import com.xworkz.resort.dto.BeachDTO;

public class BeachNoOfResortsComparator implements Comparator<BeachDTO> {

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer o1No=o1.getNoOfResorts();
		Integer o2No=o2.getNoOfResorts();
		
//		Integer o1No=o1.getName();
//		Integer o2No=o2.getName();
		
		return o2No.compareTo(o1No);
	}

	
	

	}

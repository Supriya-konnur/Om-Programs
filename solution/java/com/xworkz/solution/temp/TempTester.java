package com.xworkz.solution.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.solution.dto.MovieDTO;

public class TempTester {

	public static void main(String[] args) {
		
	MovieDTO dto1 = new MovieDTO("KGF", 5.0, 3.0, "Action");
	MovieDTO dto2 = new MovieDTO("OM", 5.0, 2.5, "Drama");
	MovieDTO dto3 = new MovieDTO("OM1", 5.0, 2.5, "Drama");
	
	List<MovieDTO> movieDTOs = new ArrayList();
	movieDTOs.add(dto1);
	movieDTOs.add(dto2);
	movieDTOs.add(dto3);
	
	ListIterator<MovieDTO> iterator = movieDTOs.listIterator(2);
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
//	movieDTOs.add(3,dto1);
	movieDTOs.set(1, dto3);
	
	System.out.println(movieDTOs);
	System.out.println(movieDTOs.indexOf(dto3));
	}

}

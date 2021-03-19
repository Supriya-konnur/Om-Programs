
package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		
		MovieDTO dto1= new MovieDTO("KGF",5.0,2.30,"Action");
		MovieDTO dto2= new MovieDTO("Om",5.0,2.5,"Drama");
		MovieDTO dto3= new MovieDTO("Bahubali",4.5,2.50,"Action/war");
		MovieDTO dto4 = new MovieDTO("Andhra Wala", 5.0, 3.0, "Action");
		MovieDTO dto5= new MovieDTO("Tarle Nan Maga",5.0,2.30,"Comedy");
		

		
		Collection<MovieDTO> movieDto = new ArrayList();
		movieDto.add(dto1);
		movieDto.add(dto2);
		movieDto.add(dto3);
		movieDto.add(dto4);
		movieDto.add(dto5);
		
		Iterator<MovieDTO> iterator = movieDto.iterator();
		
		while(iterator.hasNext()) {
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if(movie.getGenre().contentEquals("Comedy")) {
				iterator.remove();
//				movie.setGenre(null);
				
			}
		}
		System.out.println();
		System.out.println("movie after removing comedy " +movieDto.size());
		
		for (MovieDTO dto : movieDto) {
			System.out.println(dto);
			
		}

	}



}

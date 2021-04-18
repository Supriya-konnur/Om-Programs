package com.xworkz.resort.service1;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	void validateAndSave(ResortDTO dto);
	
	boolean validateAndupdateLocationByName(String location, String name);

	boolean validateAndupdateLocationByNameandRating(String location, String name, double rating);

	boolean validateAnddeleteByNameAndLocation(String name, String location);

	boolean validateAndaddMultipleResorts(List<ResortDTO> dtos);

	int validateAndtotalResortSize();

	List<ResortDTO> getAll();

}

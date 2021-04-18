package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {

	boolean save(ResortDTO dto);

	boolean updateLocationByName(String location, String name);

	boolean updateLocationByNameandRating(String location, String name, double rating);

	boolean deleteByNameAndLocation(String name, String location);

	boolean addMultipleResorts(List<ResortDTO> dtos);

	int totalResortSize();

	List<ResortDTO> getAll();

}

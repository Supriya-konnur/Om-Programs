package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("created ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");

		boolean added = this.resortList.add(dto);
		System.out.println("added" + added);
		return added;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		for (ResortDTO resortDTO : resortList) {
			if (resortDTO.getName().equals(name)) {
				resortDTO.setLocation(location);
				System.out.println("location updated");
				return true;
			}
		}
		System.out.println("dto not foundS");
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, double rating) {

		for (ResortDTO resortDTO : resortList) {
			if (name != null && name.length() >= 3 && name.length() <= 15 && resortDTO.getName().equals(name)
					&& rating >= 0 && rating <= 5) {
				resortDTO.setLocation(location);
				System.out.println("location updated by name and rating");
				return true;
			}
		}
		System.out.println("dto not found");
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		for (ResortDTO resortDTO : resortList) {
			if (name != null && name.length() >= 3 && name.length() <= 15 && resortDTO.getName().equals(name)
					&& location.length() >= 3 && location.length() <= 15 && resortDTO.getLocation().equals(location)) {
				this.resortList.remove(resortDTO);

				System.out.println("deteled by name and location");

				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int totalResortSize() {
		System.out.println("invoked totalResortSize");
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("invoked getAll");
		return this.resortList;
		
	}

}

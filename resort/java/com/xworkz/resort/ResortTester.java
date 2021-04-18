package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service1.ResortService;
import com.xworkz.resort.service1.ResortServiceImpl;

public class ResortTester {

	public static void main(String[] args) {

		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		ResortService resortService = new ResortServiceImpl(dao);
		

		ResortDTO dto = new ResortDTO("Ramanagara", "Shillandara", "Sharana", 15);
		dto.setOffers(true);
		dto.setPoolExist(true);
		dto.setPhoneNo(7894329876l);
		dto.setRating(4);
		dto.setNoOfEmployees(10);
		dto.setPricePerHead(5000);
		
		resortService.validateAndSave(dto);
		resortService.validateAndupdateLocationByName("RajajiNagar", "suresh");
		resortService.validateAndupdateLocationByNameandRating("Bagalkot", "Ramesh", 4);
		resortService.validateAnddeleteByNameAndLocation("swathi", "vijayanagr");
		resortService.validateAndtotalResortSize();
		//resortService.validateAndaddMultipleResorts(dtos);

		// ResortDTO dto1 = new ResortDTO("Rajajinagar", "Shillandara", "Suresh", 15);
//		ResortDAO dao1 = new ResortDAOImpl(list);
//		dao1.save(dto);
//		dao1.updateLocationByName("Rajajinagr", "suresh");
//		dao1.updateLocationByNameandRating("Gandhinagar", "Ramesh", 3);
//		dao1.deleteByNameAndLocation("suresh", "Rajajinagar");
//		dao1.totalResortSize();
//		dao1.getAll();
//		resortService.validateAndSave(dto);
		
		

	
	}

}

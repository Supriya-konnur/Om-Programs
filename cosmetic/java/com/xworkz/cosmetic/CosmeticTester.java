package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setType(CosmeticType.EYELINER);
		cosmeticDTO.setPrice(500);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShade(CosmeticShade.BLACK);

//		CosmeticDAO dao = new CosmeticDAOImpl();
//		dao.save(cosmeticDTO);
//		dao.updatePriceAndQuantityByBrand(200, 10, "Mac");
//		dao.updatePriceByBrandAndType(1000, "Lackme", CosmeticType.FOUNDATION);
//		dao.updateTypeByBrand("Maybelline", CosmeticType.EYELINER);
//		dao.deletByBrand("Lackme");
//		dao.deletAll();
//		dao.getAll();
//		dao.totalSize();

		CosmeticDTO cosmeticDTO1 = new CosmeticDTO();
		cosmeticDTO1.setBrand("Lakme");
		cosmeticDTO1.setType(CosmeticType.NAILPOLISH);
		cosmeticDTO1.setPrice(200);
		cosmeticDTO1.setQuantity(20);
		cosmeticDTO1.setShade(CosmeticShade.PINK);

		// dao.save(CosmeticDTO1);

		List<CosmeticDTO> cosmeticDTOs = new ArrayList<CosmeticDTO>();
		cosmeticDTOs.add(cosmeticDTO);
		cosmeticDTOs.add(cosmeticDTO1);

		for (CosmeticDTO cosmeticDTO2 : cosmeticDTOs) {
			System.out.println(cosmeticDTO2.getBrand());
		}

		//cosmeticDTOs.sort();
		
		for (CosmeticDTO cosmeticDTO2 : cosmeticDTOs) {
			System.out.println(cosmeticDTO2.getBrand());
		}

	}

}

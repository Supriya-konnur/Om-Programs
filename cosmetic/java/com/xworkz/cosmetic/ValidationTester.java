package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service1.CosmeticService;
import com.xworkz.cosmetic.service1.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setShade(CosmeticShade.BLUE);
		cosmeticDTO.setType(CosmeticType.NAILPOLISH);
		cosmeticDTO.setPrice(500);
		cosmeticDTO.setQuantity(10);
		
		CosmeticService service = new CosmeticServiceImpl();
		service.valiDataAndSave(cosmeticDTO);
	}

}

package com.xworkz.cosmetic.service1;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticService {
	
	boolean valiDataAndSave(CosmeticDTO cosmeticDTO);
	
	void deleteByBrand(String brand);
	
	int cosmeticsSize(); 

}

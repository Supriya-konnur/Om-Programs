package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	public boolean save(CosmeticDTO dto);

	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);

	boolean updatePriceByBrandAndType(double price, String brand, CosmeticType Type);

	boolean updateTypeByBrand(String brand, CosmeticType type);

	boolean deletByBrand(String brand);

	void deletAll();

	List<CosmeticDTO> getAll();

	int totalSize();
}

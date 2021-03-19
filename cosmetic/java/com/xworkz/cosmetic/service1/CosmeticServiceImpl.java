package com.xworkz.cosmetic.service1;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
	private CosmeticDAO cosmeticDAO;

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("created CosmeticServiceImpl");
		this.cosmeticDAO = cosmeticDAO;
	}

	@Override
	public boolean valiDataAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null,will validata filds");
			String brand = cosmeticDTO.getBrand();
			// null,"s",""," "

			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
			if (validData) {
				CosmeticShade Shade = cosmeticDTO.getShade();
				if (Shade != null) {
					System.out.println("Shade is valid");
					validData = true;

				} else {
					System.out.println("Shade is invalid");
					validData = false;
				}
			}

			if (validData) {
				CosmeticType type = cosmeticDTO.getType();

				if (type != null) {
					System.out.println("Type is valid");
					validData = true;
				} else {
					System.out.println("type is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}
			}
			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validData = true;
				} else {
					System.out.println("quantity is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("data is valid , can invoke dao");
				//CosmeticDAO cosmeticDAO = new CosmeticDAOImpl();
				cosmeticDAO.save(cosmeticDTO);
			}
		} else {
			System.out.println("dto is null, invalid data");
		}
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");

		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deletByBrand(brand);
		}

		else {
			System.out.println("invalid brand");
		}
	}

	@Override
	public int cosmeticsSize() {

		return this.cosmeticDAO.totalSize();
	}

}

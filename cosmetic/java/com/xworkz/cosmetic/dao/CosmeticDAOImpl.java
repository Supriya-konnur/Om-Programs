package com.xworkz.cosmetic.dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {
	// declaring properties of List
	private List<CosmeticDTO> cosmetics;

	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		this.cosmetics=list;
		System.out.println("created cosmeticDAOImpl");
		this.cosmetics = new ArrayList<CosmeticDTO>();

	}

	@Override
	public boolean save(CosmeticDTO dto) {
		System.out.println("invoked save method");
		System.out.println("invked to dto" + dto);
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetics are added");
		else
			System.out.println("cosmetics are not added");
		return added;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("found the brand, updating the price and quantity:");
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuantity(quantity);
				System.out.println("The DTO after updating");
				System.out.println(cosmeticDTO);
				return true;
			}
		}
		System.out.println("the brand enterd is not available:");

		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType Type) {
		System.out.println("invoked updatePriceByBrandAndType");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && Type != null && cosmeticDTO.getBrand().equals(brand)
					&& cosmeticDTO.getType().equals(Type)) {
				System.out.println("Found the cosmetic with given type and brand, updateing the price:");
				cosmeticDTO.setPrice(price);
				System.out.println("the DTO after updating the price");
				System.out.println(cosmeticDTO);
				return true;
			}
		}
		System.out.println("the cosmetic for enterd type and brand is not not valid");
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {

		System.out.println("invoked updateTypeByBrand");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("found the cosmetic with  the given brand,updating the type:");
				cosmeticDTO.setType(type);
				System.out.println(cosmeticDTO);
				return true;
			}

		}
		System.out.println("cosmatic matching the enterd brand was not found");
		return false;
	}

	@Override
	public boolean deletByBrand(String brand) {
		System.out.println("invoked deletByBrand");

//		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
//		while(iterator.hasNext()) {
//			if(iterator.next().getBrand().equals(brand)) {
//				iterator.remove();
//			}
//		}

		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("found the cosmetic with  the given brand,deleting the cosmetic: ");
				this.cosmetics.remove(cosmeticDTO);
				System.out.println("the size of collection after deleting" + brand);
				System.out.println(this.cosmetics.size());
				return true;
			}
		}
		return false;
	}

	@Override
	public void deletAll() {
		System.out.println("invoked deletAll");
		this.cosmetics.clear();
		System.out.println("the size of of collection after deleting all elements" + this.cosmetics.size());
	}

	@Override
	public List<CosmeticDTO> getAll() {
		System.out.println("invoked getAll");
		return this.cosmetics;
		
	}

	@Override
	public int totalSize() {
		System.out.println("invoked totalsize");
		return this.cosmetics.size();
	}

}

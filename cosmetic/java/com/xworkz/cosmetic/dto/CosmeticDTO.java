package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {
	
	private String brand;
	private CosmeticShade Shade;
	private double price;
	private int quantity;
	private CosmeticType Type;
	
	
	public CosmeticDTO() {
		super();
		this.brand = brand;
		this.Shade = Shade;
		this.price = price;
		this.quantity = quantity;
		this.Type = Type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CosmeticShade getShade() {
		return Shade;
	}
	public void setShade(CosmeticShade shade) {
		Shade = shade;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CosmeticType getType() {
		return Type;
	}
	public void setType(CosmeticType type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", Shade=" + Shade + ", price=" + price + ", quantity=" + quantity
				+ ", Type=" + Type + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO dto= (CosmeticDTO)obj;
			if(this.brand!= null && this.Type!=null) {
//			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand.equals(dto.getBrand()) && this.Type == dto.getType()) {
				System.out.println("brand and type is matching" + dto);
				return true;
			}
			}
		}
		System.out.println("cosmeticDTO is not equal");
		return false;
	}
	

}

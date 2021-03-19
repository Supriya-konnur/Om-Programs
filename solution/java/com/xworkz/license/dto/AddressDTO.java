package com.xworkz.license.dto;

public class AddressDTO {
	
	private int doorNo;
	private String street;
	private int pincode;
	private String area;
	private String city;
	private String state;
	private String buildingName;
	
	public AddressDTO(int doorNo, String street, int pincode, String area, String city, String state,
			String buildingName) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.buildingName = buildingName;
	}

	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", street=" + street + ", pincode=" + pincode + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", buildingName=" + buildingName + "]";
	}
	

}

package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constant.BloodGroup;
import com.xworkz.license.constant.Gender;


public class CommonDTO {

	@Override
	public String toString() {
		return "CommonDTO [name=" + name + ", age=" + age + ", addressDTO=" + addressDTO + ", DOB=" + DOB
				+ ", mobileNo=" + mobileNo + ", bloodGroup=" + bloodGroup + ", gender=" + gender + "]";
	}

	private String name;
	private int age;
	private AddressDTO addressDTO;
	private Date DOB;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;

	public CommonDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

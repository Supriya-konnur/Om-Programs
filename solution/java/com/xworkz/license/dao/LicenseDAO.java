package com.xworkz.license.dao;

import com.xworkz.license.constant.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {
	void save(LicenseDTO dto);
	LicenseDTO findByIdProofNo(String idProof);
	
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	boolean deleteByIdproofNo(String idProof);
//	String getIDproofNo();
	
	
	
	

}

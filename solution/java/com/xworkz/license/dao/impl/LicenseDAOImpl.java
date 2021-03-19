package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.license.constant.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);

		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");

	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);

		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();

			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
			

		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);

		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update,licence is found");
			dtoFromDB.setVehicleType(type);
			return true;
			
		}
		else {
			System.out.println("cannot update,licence is not found");
		}
		return false;
	}

	@Override
	public boolean deleteByIdproofNo(String idProof) {
		System.out.println("invoked deleteByIdproofNo");
		System.out.println("idProof:"+idProof);
		LicenseDTO dtoFromDB= this.findByIdProofNo(idProof);
		
		if(dtoFromDB !=null) {
			System.out.println("can delete, license is found");
			database.remove(dtoFromDB);
			System.out.println("deleted, New dataBase size:"+database.size());
			return true;
		}
		else {
			System.out.println("cannot delete,license not found"
					+ "");
		}
		
		return false;
	}

}

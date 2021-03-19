package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constant.IdProof;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;
import com.xworkz.license.constant.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;

public class LicenseTest {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(3254, "Laxminagar", 560036, "Jamakhandi", "Jamakhandi", "Ka", "NA");

		Date dob = new Date();

		SimpleDateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob = formate.parse("16/10/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO dto = new LicenseDTO();
		dto.setIdProof(IdProof.ADHARCARD);
		dto.setIdProofNo("7343 8732 9876");
		dto.setCommercial(false);
		dto.setDisability(false);
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);
		
		LicenseDTO dtoFound = dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoFound);

		boolean update=dao.updateVehicleTypeByIdProofNo("6363 8787 6449", VehicleType.LMV);
		System.out.println("updated"+update);
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6363 8787 6449");
		//System.out.println(dtoafterUpdate);

	}

}

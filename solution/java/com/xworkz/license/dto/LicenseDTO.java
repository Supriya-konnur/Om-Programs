package com.xworkz.license.dto;

import java.util.Date; 

//import java.sql.Date;

import com.xworkz.license.constant.IdProof;
import com.xworkz.license.constant.VehicleType;

public class LicenseDTO extends CommonDTO{
	
	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startdate=" + startdate + ", disability=" + disability + ", commercial=" + commercial + "]";
	}

	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disability;
	private boolean commercial;
	
	

	

	public IdProof getIdProof() {
		return idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public Date getStartdate() {
		return startdate;
	}

	public boolean isDisability() {
		return disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	
	
	
	

}

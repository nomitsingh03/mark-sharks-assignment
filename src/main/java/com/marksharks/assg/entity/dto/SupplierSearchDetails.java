package com.marksharks.assg.entity.dto;

import java.util.Set;

import com.marksharks.assg.entity.ManufacturingProcesses;
import com.marksharks.assg.entity.NatureOfBusiness;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class SupplierSearchDetails {

	@NotBlank
	private String location;
	
	@NotBlank
	private NatureOfBusiness natureOfBusiness;
	
	@NotEmpty
	private Set<ManufacturingProcesses> manufacturingProcesses;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public NatureOfBusiness getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public Set<ManufacturingProcesses> getManufacturingProcesses() {
		return manufacturingProcesses;
	}

	public void setManufacturingProcesses(Set<ManufacturingProcesses> manufacturingProcesses) {
		this.manufacturingProcesses = manufacturingProcesses;
	}

	@Override
	public String toString() {
		return "SupplierSearchDetails [location=" + location + ", natureOfBusiness=" + natureOfBusiness
				+ ", manufacturingProcesses=" + manufacturingProcesses + "]";
	}
	
	
}

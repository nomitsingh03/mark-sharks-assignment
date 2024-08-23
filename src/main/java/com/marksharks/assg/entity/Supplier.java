package com.marksharks.assg.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.metamodel.PluralAttribute.CollectionType;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int supplierId;
	
	@Column(unique = true)
	private String companyName;
	
	private String website;
	
	private String location;
	
	@Enumerated(EnumType.STRING)
	private NatureOfBusiness natureOfBusiness;
	
	@ElementCollection
	@CollectionTable(name = "supplier_manufacturing_processes")
	@Enumerated(EnumType.STRING)
	private Set<ManufacturingProcesses> manufacturingProcesses = new HashSet<>();

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

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
		this.manufacturingProcesses.addAll(manufacturingProcesses);
	}
	public void setManufacturingProcesses(ManufacturingProcesses manufacturingProcesses) {
		this.manufacturingProcesses.add(manufacturingProcesses);
	}

}

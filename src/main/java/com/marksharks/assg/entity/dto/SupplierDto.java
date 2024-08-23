package com.marksharks.assg.entity.dto;

import java.util.Set;

import com.marksharks.assg.entity.ManufacturingProcesses;
import com.marksharks.assg.entity.NatureOfBusiness;

public record SupplierDto(String companyName, String website, String location, NatureOfBusiness natureOfBusiness, Set<ManufacturingProcesses> manufacturingProcesses) {

}

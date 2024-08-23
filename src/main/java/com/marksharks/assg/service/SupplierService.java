package com.marksharks.assg.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.marksharks.assg.entity.Supplier;
import com.marksharks.assg.entity.dto.SupplierDto;
import com.marksharks.assg.entity.dto.SupplierResponse;
import com.marksharks.assg.entity.dto.SupplierSearchDetails;

public interface SupplierService {

	String createSupplier(SupplierDto supplierDto);
	
	SupplierResponse getAllSuppliersList(SupplierSearchDetails supplierSearchDetails, Integer pageNumber, Integer pageSize);
	
	List<Supplier> getAllSupliers();
	
	List<Supplier> getAllSuppliers(SupplierSearchDetails supplierSearchDetails, Integer pageNumber, Integer pageSize);
	
	
}

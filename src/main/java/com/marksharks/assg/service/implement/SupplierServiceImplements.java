package com.marksharks.assg.service.implement;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marksharks.assg.entity.Supplier;
import com.marksharks.assg.entity.dto.SupplierDto;
import com.marksharks.assg.entity.dto.SupplierResponse;
import com.marksharks.assg.entity.dto.SupplierSearchDetails;
import com.marksharks.assg.repository.SupplierRepository;
import com.marksharks.assg.service.SupplierService;

@Service
public class SupplierServiceImplements implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public String createSupplier(SupplierDto supplierDto) {
		try {
			Supplier supplier = new Supplier();
			supplier.setCompanyName(supplierDto.companyName());
			supplier.setLocation(supplierDto.location());
			supplier.setManufacturingProcesses(supplierDto.manufacturingProcesses());
			supplier.setNatureOfBusiness(supplierDto.natureOfBusiness());
			supplier.setWebsite(supplierDto.website());
			System.out.println(supplier.getWebsite());
			this.supplierRepository.save(supplier);
		} catch (Exception e) {
			return "Some error Occured " + e.getMessage();
		}
		
		return "Supplier registerd successfully";
	}


	@Override
	public SupplierResponse getAllSuppliersList(SupplierSearchDetails supplierSearchDetails, Integer pageNumber, Integer pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable =  PageRequest.of(pageNumber, pageSize);
		Page<Supplier> pages =  this.supplierRepository.findSuppliersByLocationAndNatureOfBusinessAndManufacturingProcesses(supplierSearchDetails.getLocation(), supplierSearchDetails.getNatureOfBusiness(), supplierSearchDetails.getManufacturingProcesses(), pageable);
		List<Supplier> suppliers = pages.getContent();
		
		SupplierResponse supplierResponse = new SupplierResponse();
		supplierResponse.setSuppliers(suppliers);
		supplierResponse.setPageNumber(pages.getNumber());
		supplierResponse.setPageSize(pages.getSize());
		supplierResponse.setTotalSupplierss(pages.getTotalElements());
		supplierResponse.setTotalPages(pages.getTotalPages());
		supplierResponse.setLastPage(pages.isLast());
		
		System.out.println(supplierResponse);
		return supplierResponse;
	}


	@Override
	public List<Supplier> getAllSuppliers(SupplierSearchDetails supplierSearchDetails, Integer pageNumber,
			Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable pageable =  PageRequest.of(pageNumber, pageSize);
		Page<Supplier> pages =  this.supplierRepository.findSuppliersByLocationAndNatureOfBusinessAndManufacturingProcesses(supplierSearchDetails.getLocation(), 
				supplierSearchDetails.getNatureOfBusiness(), supplierSearchDetails.getManufacturingProcesses(), pageable);
		List<Supplier> suppliers = pages.getContent();
		return suppliers;
	}


	@Override
	public List<Supplier> getAllSupliers() {
		// TODO Auto-generated method stub
		return this.supplierRepository.findAll();
	}


}

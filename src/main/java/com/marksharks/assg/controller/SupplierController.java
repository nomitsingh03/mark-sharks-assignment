package com.marksharks.assg.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marksharks.assg.entity.Supplier;
import com.marksharks.assg.entity.dto.SupplierDto;
import com.marksharks.assg.entity.dto.SupplierResponse;
import com.marksharks.assg.entity.dto.SupplierSearchDetails;
import com.marksharks.assg.service.SupplierService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/supplier/")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@PostMapping("/search1/")
	public ResponseEntity<SupplierResponse> getAllSuppliers(
			@RequestBody SupplierSearchDetails supplierSearchDetails,
			@RequestParam(value= "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize){
		System.out.println(supplierSearchDetails);
		
		SupplierResponse supplierResponse = supplierService.getAllSuppliersList(supplierSearchDetails, pageNumber, pageSize);
		return new ResponseEntity<SupplierResponse>(supplierResponse, HttpStatus.OK);
		
	}
	@PostMapping("/search2/")
	public ResponseEntity<List<Supplier>> getAllSuppliersw(
		    @RequestBody SupplierSearchDetails supplierSearchDetails,
			@RequestParam(value= "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize){
		System.out.println(supplierSearchDetails);
		
		List<Supplier> supplierResponse = supplierService.getAllSuppliers(supplierSearchDetails, pageNumber, pageSize);
		return new ResponseEntity<List<Supplier>>(supplierResponse, HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Supplier>> getAllSuppliers(){
		return new ResponseEntity<List<Supplier>>(this.supplierService.getAllSupliers(), HttpStatus.OK);
	}
	
	@PostMapping("/create/")
	public ResponseEntity<String> registerSupplier(@RequestBody SupplierDto supplierDto){
		String ret = supplierService.createSupplier(supplierDto);
		return new ResponseEntity<String>(ret, HttpStatus.CREATED);
	}

}

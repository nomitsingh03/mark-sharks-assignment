package com.marksharks.assg;

import java.util.Set;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marksharks.assg.entity.ManufacturingProcesses;
import com.marksharks.assg.entity.NatureOfBusiness;
import com.marksharks.assg.entity.Supplier;
import com.marksharks.assg.repository.SupplierRepository;
import com.marksharks.assg.service.SupplierService;

@SpringBootApplication
public class MarkSharksAssignmentApplication implements CommandLineRunner{
	
	@Autowired
	private SupplierService supplierService;

	public static void main(String[] args) {
		SpringApplication.run(MarkSharksAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		// Supplier 1
//		Supplier supplier1 = new Supplier();
//		supplier1.setCompanyName("ABC Manufacturing");
//		supplier1.setWebsite("https://www.abcmfg.com");
//		supplier1.setLocation("Chicago");
//		supplier1.setNatureOfBusiness(NatureOfBusiness.MEDIUM_SCALE);
//		supplier1.setManufacturingProcesses(ManufacturingProcesses.MOULDING);
//		supplier1.getManufacturingProcesses().add(ManufacturingProcesses.CASTING);
//		supplierService.createSupplier(supplier1);
//
//		// Supplier 2
//		Supplier supplier2 = new Supplier();
//		supplier2.setCompanyName("XYZ Industries");
//		supplier2.setWebsite("https://www.xyzind.com");
//		supplier2.setLocation("SanFrancisco");
//		supplier2.setNatureOfBusiness(NatureOfBusiness.LARGE_SCALE);
//		supplier2.setManufacturingProcesses(ManufacturingProcesses.PRINTING_3D);
//		supplier2.getManufacturingProcesses().add(ManufacturingProcesses.MOULDING);
//		supplier2.getManufacturingProcesses().add(ManufacturingProcesses.COATING);
//		supplierService.createSupplier(supplier2);
//
//		// Supplier 3
//		Supplier supplier3 = new Supplier();
//		supplier3.setCompanyName("Definite Solutions");
//		supplier3.setWebsite("https://www.definite.solutions");
//		supplier3.setLocation("Austin");
//		supplier3.setNatureOfBusiness(NatureOfBusiness.SMALL_SCALE);
//		supplier3.setManufacturingProcesses(Set.of(ManufacturingProcesses.PRINTING_3D, ManufacturingProcesses.COATING)); 
//		supplierService.createSupplier(supplier3);
//		
//		// Supplier 4 (No website)
//		Supplier supplier4 = new Supplier();
//		supplier4.setCompanyName("Reliable Parts Co.");
//		supplier4.setLocation("Detroit");
//		supplier4.setNatureOfBusiness(NatureOfBusiness.MEDIUM_SCALE);
//		supplier4.setManufacturingProcesses(Set.of(ManufacturingProcesses.CASTING, ManufacturingProcesses.COATING));  
//		supplierService.createSupplier(supplier4);
//		
//		
//		Supplier supplier5 = new Supplier();
//		supplier5.setCompanyName("Innovative Technologies");
//		supplier5.setWebsite("https://www.innovativetech.com");
//		supplier5.setLocation("Seattle");
//		supplier5.setNatureOfBusiness(NatureOfBusiness.LARGE_SCALE);
//		supplier5.setManufacturingProcesses(Set.of(ManufacturingProcesses.MOULDING, ManufacturingProcesses.COATING)); 
//		supplierService.createSupplier(supplier5);
//		
//		
//		Supplier supplier6 = new Supplier();
//		supplier6.setCompanyName("ABCd Manufacturing");
//		supplier6.setWebsite("https://www.abcg.com");
//		supplier6.setLocation("Chicago");
//		supplier6.setNatureOfBusiness(NatureOfBusiness.MEDIUM_SCALE);
//		supplier6.setManufacturingProcesses(ManufacturingProcesses.MOULDING);
//		supplier6.getManufacturingProcesses().add(ManufacturingProcesses.COATING);
//		supplierService.createSupplier(supplier6);
		
	}
	
	

}

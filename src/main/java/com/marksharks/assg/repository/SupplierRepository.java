package com.marksharks.assg.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marksharks.assg.entity.ManufacturingProcesses;
import com.marksharks.assg.entity.NatureOfBusiness;
import com.marksharks.assg.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	
////	@Query("SELECT s FROM Supplier s WHERE LOWER(s.location) LIKE LOWER(:city) AND s.natureOfBusiness = :natureOfBusiness AND s.manufacturingProcesses OVERLAPPING :manufacturingProcesses")
//	Page<Supplier> findSuppliersByLocationAndNatureOfBusinessAndManufacturingProcesses(@Param("city") String city, 
//			@Param("natureOfBusiness") NatureOfBusiness natureOfBusiness,
//			@Param("manufacturingProcesses") Set<ManufacturingProcesses> manufacturingProcesses, Pageable pageable);
	
	@Query("SELECT s FROM Supplier s WHERE LOWER(s.location) LIKE LOWER(:location) AND s.natureOfBusiness = :natureOfBusiness AND EXISTS (SELECT 1 FROM s.manufacturingProcesses mp WHERE mp IN :manufacturingProcesses)")
	Page<Supplier> findSuppliersByLocationAndNatureOfBusinessAndManufacturingProcesses(@Param("location") String location, @Param("natureOfBusiness") NatureOfBusiness natureOfBusiness, @Param("manufacturingProcesses") Set<ManufacturingProcesses> manufacturingProcesses, Pageable pageable);

}

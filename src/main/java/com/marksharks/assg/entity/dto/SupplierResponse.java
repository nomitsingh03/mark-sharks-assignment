package com.marksharks.assg.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.marksharks.assg.entity.Supplier;


public class SupplierResponse {

	private List<Supplier> suppliers;
	private int pageNumber;
	private int pageSize;
	private long totalSuppliers;
	private int totalPages;
	private boolean lastPage;
	
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = new ArrayList<>(suppliers);
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalSupplierss() {
		return totalSuppliers;
	}
	public void setTotalSupplierss(long totalSuppliers) {
		this.totalSuppliers = totalSuppliers;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	@Override
	public String toString() {
		return "SupplierResponse [suppliers=" + suppliers + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize
				+ ", totalSuppliers=" + totalSuppliers + ", totalPages=" + totalPages + ", lastPage=" + lastPage + "]";
	}
	
	
}

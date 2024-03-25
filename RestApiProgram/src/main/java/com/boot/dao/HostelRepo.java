package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.Hostels;

@Repository
public interface HostelRepo extends JpaRepository<Hostels, Integer> {
	
	public List<Hostels> findByHostelName(String name);
	
	@Query("from Hostels h where h.hostelLoc = :loc and h.hostelRent = :rent")
	public List<Hostels> findByLocAndRent(
			@Param(value = "loc") String location,@Param(value = "rent")int rent);
	
	@Query("from Hostels h where h.hostelName = :name and h.hostelLoc = :loc")
	public List<Hostels> findByNameAndLoc(
			@Param(value = "name") String name,@Param(value = "loc")String location);
	
	@Query("from Hostels h where h.hostelName = :name and h.hostelRent = :rent")
	public List<Hostels> findByNameAndRent(
			@Param(value = "name")String name,@Param(value = "rent")int rent);
	
	@Query("from Hostels h where h.hostelRent between :min and :max")
	public List<Hostels> findByRentRange(
			@Param(value = "min")int min,@Param(value = "max")int max);
	
	@Query("from Hostels h where h.hostelLoc =:loc and h.hostelRent between :min and :max")
	public List<Hostels> findByLocAndPriceRange(@Param(value = "loc") String location,
			@Param(value = "min")int min,@Param(value = "max")int max);
	

}

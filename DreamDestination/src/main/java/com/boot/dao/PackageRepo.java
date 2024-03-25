package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.Packages;

@Repository
public interface PackageRepo extends JpaRepository<Packages, Integer> {
	
	public List<Packages> findByPackId(int packId);
	
	@Query("from Packages p where p.destination =:dest")
	List<Packages> findByDestination(@Param(value = "dest") String dest);
}

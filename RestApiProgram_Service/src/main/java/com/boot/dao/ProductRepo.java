package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.Products;



@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{
	
	public List<Products> findByPName(String name);
	
	public Products updateProduct(int id,Products prod);
	
	@Query("from Products p where p.price between :min and :max")
	public List<Products> findByPriceRange(@Param(value = "min")int min, @Param(value = "max")int max);
	
	
}

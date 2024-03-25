package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ProductRepo;
import com.boot.entity.Products;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	

	public List<Products> listProducts(){
		return repo.findAll();
	}
	
	public void addProduct(Products prod) {
		repo.save(prod);
	}
	
	public void delDataById(int code) {
		repo.deleteById(code);
	}
	
	public Products showById(int id){
		return repo.findById(id).get();
		//get() is used specific to findById method only
	}
	
	public List<Products> showByName(String name){
		return repo.findByPName(name);
	}
	
	public Products updateProduct(int code,Products prod) {
		return repo.findById(code).map(
				product1 -> {
					product1.setpCode(prod.getpCode());
					product1.setpName(prod.getpName());
					product1.setPrice(prod.getPrice());
					return repo.save(product1);
				}
				).orElseGet(() ->{
					return repo.save(prod);
				});
				
	}
	
	public List<Products> showByPriceRange(int min,int max){
		return repo.findByPriceRange(min, max);
	}
	
}

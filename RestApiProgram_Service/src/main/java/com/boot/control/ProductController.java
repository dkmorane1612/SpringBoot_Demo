package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Products;
import com.boot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService serv;
	
	@GetMapping("/show")
	public List<Products> listHost(){
		return serv.listProducts();
	}
	
	@PostMapping("/add")
	public void addData(@RequestBody Products prod) {
		serv.addProduct(prod);
	}
	
	@DeleteMapping("/delByCode/{code}")
	public void delDataBypCode(@PathVariable int code) {
		serv.delDataById(code);
	}
	
	@GetMapping("/showById/{id}")
	public Products showById(@PathVariable int id){
		return serv.showById(id);
	}
	
	@GetMapping("/showByName/{name}")
	public List<Products> showByName(@PathVariable String name){
		
		return serv.showByName(name);
	}
	
	@PutMapping("/updateProduct/{id}")
	public void updateProduct(@PathVariable int id, @RequestBody Products prod) {
		serv.updateProduct(id, prod);
	}
	
	@GetMapping("/showByPriceRange/{min}/{max}")
	public List<Products> showByPriceRange(@PathVariable int min, @PathVariable int max){
		return serv.showByPriceRange(min, max);
	}
}

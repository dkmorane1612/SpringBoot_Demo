package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.PackageRepo;
import com.boot.entity.Packages;


@RestController
@CrossOrigin("http://localhost:4200")
public class PackageController {
	@Autowired
	private PackageRepo repo;
	
	@GetMapping("/showPack")
	public List<Packages> listHost(){
		return repo.findAll();
	};
	
	@GetMapping("/showById/{id}")
	public List<Packages> showByPackId(@PathVariable int id){
		return repo.findByPackId(id);
	}
	
	@PostMapping("/addPack")
	public void addData(@RequestBody Packages pack) {
		repo.save(pack);
	}
	
	@GetMapping("/showByDest/{dest}")
	public List<Packages> showByDestination(@PathVariable String dest){
		return repo.findByDestination(dest);
	}
}

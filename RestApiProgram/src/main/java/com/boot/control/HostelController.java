package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.HostelRepo;
import com.boot.entity.Hostels;

//import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("*")    //use to join this program to Angular Application
public class HostelController {
	
	
	//without Service Repository
	@Autowired
	private HostelRepo repo;
	
	@GetMapping("/show")
	public List<Hostels> listHost(){
		return repo.findAll();
	}
	
	@PostMapping("/add")
	public void addData(@RequestBody Hostels host) {
		repo.save(host);
	}

	
//	@PostMapping("/addData")
//	public String addDataForm() 
//	{
//		return "addData.jsp";
//	}
//	
//	@PostMapping("/addRecord")
//	public String addOperation(HttpServletRequest req) 
//	{
//		int hostId =Integer.parseInt(req.getParameter("hostId"));
//		String hostName =req.getParameter("hostName");
//		String hostLoc =req.getParameter("hostLoc");
//		int hostRent =Integer.parseInt(req.getParameter("hostRent"));
//		
//		System.out.println("Hostel Id :"+hostId+" Hostel Name :"+hostName+" Hostel Location :"+hostLoc+" Hostel Rent :"+hostRent);
//		repo.save(new Hostels(hostId, hostName, hostLoc, hostId));
//		System.out.println("Record Added");
//		
//		return "index.html";
//	}
	 
	
	@GetMapping("/showById/{id}")
	public Hostels showById(@PathVariable int id){
		return repo.findById(id).get();
		//get() is used specific to findById method only
	}
	
	@GetMapping("/showByName/{name}")
	public List<Hostels> showByName(@PathVariable String name){
		
		return repo.findByHostelName(name);
	}
	
	@DeleteMapping("/delById/{id}")
	public void delDataById(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	//Query design methods with more than 1 parameter
	@GetMapping("/byLocAndRent/{loc}/{rent}")
	public List<Hostels> getByLocAndPrc(@PathVariable String loc, @PathVariable int rent){
		return repo.findByLocAndRent(loc, rent);
	}
	
	@GetMapping("/byNameAndloc/{name}/{loc}")
	public List<Hostels> getByNmAndLoc(@PathVariable String name, @PathVariable String loc){
		return repo.findByNameAndLoc(name, loc);
	}
	
	@GetMapping("/byNameAndRent/{name}/{rent}")
	public List<Hostels> getByNmAndPrc(@PathVariable String name, @PathVariable int rent){
		return repo.findByNameAndRent(name,rent);
	}
	
	@GetMapping("/byRentRange/{min}/{max}")
	public List<Hostels> getByRentRange(@PathVariable int min, @PathVariable int max){
		return repo.findByRentRange(min, max);
	}
	
	@GetMapping("/byLocAndRentRange/{loc}/{min}/{max}")
	public List<Hostels> getByRentRange(@PathVariable String loc ,@PathVariable int min, @PathVariable int max){
		return repo.findByLocAndPriceRange(loc, min, max);
	}
	
	
}

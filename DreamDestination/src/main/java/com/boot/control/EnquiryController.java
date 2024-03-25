package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.EnquiryRepo;
import com.boot.entity.Enquiry;

@RestController
@CrossOrigin("http://localhost:4200")
public class EnquiryController {
	@Autowired
	private EnquiryRepo repo;
	
	@GetMapping("/showEnq")
	public List<Enquiry> listHost(){
		return repo.findAll();
	};
	
	@PostMapping("/addEnquiry")
	public void addData(@RequestBody Enquiry enq1) {
		repo.save(enq1);
	}
}

package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.BookingRepo;
import com.boot.entity.Booking;

@RestController
@CrossOrigin("http://localhost:4200") 
public class BookingController {
	
	@Autowired
	private BookingRepo repo;
	
	@GetMapping("/showBooking")
	public List<Booking> listBooking(){
		return repo.findAll();
	};
	
	@PostMapping("/addbooking")
	public void addData(@RequestBody Booking bk1) {
		repo.save(bk1);
	}

}

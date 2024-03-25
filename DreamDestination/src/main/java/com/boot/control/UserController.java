package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.UserRepo;
import com.boot.entity.User;

@RestController
@CrossOrigin("http://localhost:4200") 
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/show")
	public List<User> listHost(){
		return repo.findAll();
	};
	
	@PostMapping("/addUser")
	public void addData(@RequestBody User user1) {
		repo.save(user1);
	}
	
	@GetMapping("/validation/{emailId}/{password}")
	public List<User> findLogin(@PathVariable String emailId,@PathVariable String password){
		return repo.findByEmailPass(emailId,password);
	}
	
	
}

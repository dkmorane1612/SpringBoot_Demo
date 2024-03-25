package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
	
	@Query("from User u where u.emailId =:email and u.password =:pass")
	public List<User> findByEmailPass(@Param(value = "email") String emailId ,@Param(value = "pass")String password);
	
	
}

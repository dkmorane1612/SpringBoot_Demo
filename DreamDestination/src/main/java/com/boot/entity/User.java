package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
	
	@Column(name ="userName")
	private String userName;
	@Id
	@Column(name ="emailId")
	private String emailId;
	@Column(name ="address")
	private String address;
	@Column(name ="age")
	private int age;
	@Column(name ="contactNo")
	private String contactNo;
	@Column(name ="password")
	private String password;	
	
}

package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "booking")
public class Booking {
	
	@Column(name ="name")
	private String name;
	@Column(name ="emailId")
	private String emailId;
	@Id
	@Column(name ="transactionId")
	private String transactionId;
	@Column(name ="contactNo")
	private String contactNo;
	@Column(name ="packName")
	private String packName;
	@Column(name ="price")
	private int price;
	@Column(name ="payment")
	private String payment;
	
}

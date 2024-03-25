package com.boot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enquiry")
public class Enquiry {
	@Column(name ="name")
	private String name;
	@Id
	@Column(name ="emailId")
	private String emailId;
	@Column(name ="contactNo")
	private String contactNo;
	@Column(name ="age")
	private int age;
	@Column(name ="destination")
	private String destination;
	
	public Enquiry() {
		
	}

	public Enquiry(String name, String emailId, String contactNo, int age, String destination) {
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.age = age;
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Enquiry [name=" + name + ", emailId=" + emailId + ", contactNo=" + contactNo + ", age=" + age
				+ ", destination=" + destination + "]";
	}
	
}

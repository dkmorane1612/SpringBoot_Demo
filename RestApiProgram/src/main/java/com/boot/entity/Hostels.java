package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hostels {
	@Id
	private int hostelId;
	@Column(length = 35)
	private String hostelName;
	@Column(length = 50)
	private String hostelLoc;
	private int hostelRent;
	
	public Hostels() {
		
	}

	public Hostels(int hostelId, String hostelName, String hostelLoc, int hostelRent) {
		this.hostelId = hostelId;
		this.hostelName = hostelName;
		this.hostelLoc = hostelLoc;
		this.hostelRent = hostelRent;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getHostelLoc() {
		return hostelLoc;
	}

	public void setHostelLoc(String hostelLoc) {
		this.hostelLoc = hostelLoc;
	}

	public int getHostelRent() {
		return hostelRent;
	}

	public void setHostelRent(int hostelRent) {
		this.hostelRent = hostelRent;
	}

	@Override
	public String toString() {
		return "Hostels [hostelId=" + hostelId + ", hostelName=" + hostelName + ", hostelLoc=" + hostelLoc
				+ ", hostelRent=" + hostelRent + "]";
	}
	
	
	
}

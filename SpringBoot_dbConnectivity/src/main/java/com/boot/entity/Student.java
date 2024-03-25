package com.boot.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	private int rollNo;
	@Column(length = 35)
	private String studName;
	private Date birthDate;
	@Column(length = 100)
	private String resAdd;
	
	public Student() {
		
	}

	public Student(int rollNo, String studName, Date birthDate, String resAdd) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.birthDate = birthDate;
		this.resAdd = resAdd;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getResAdd() {
		return resAdd;
	}

	public void setResAdd(String resAdd) {
		this.resAdd = resAdd;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", birthDate=" + birthDate + ", resAdd="
				+ resAdd + "]";
	}

}

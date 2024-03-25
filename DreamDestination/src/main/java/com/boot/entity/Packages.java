package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "packages")
public class Packages {
	@Id
	@Column(name ="packId")
	private int packId;
	@Column(name ="packName")
	private String packName;
	@Column(name ="destination")
	private String destination;
	@Column(name ="date")
	private String date;
	@Column(name ="duration")
	private String duration;
	@Column(name ="price")
	private int price;
	@Column(name ="description")
	private String description;
	@Column(name ="image")
	private String image;
	

}

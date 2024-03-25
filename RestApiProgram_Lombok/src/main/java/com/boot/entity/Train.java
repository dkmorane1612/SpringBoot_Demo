package com.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
	
	private String tForm;
	private String dest;
	@Id
	private int trainNo;
	private String tName;
}

package com.spring.springboot_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Meghana {
	@Id
	private String name;
	private int phoneNo;
}

package com.spring.springboot_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String empName;
private String empEmail;
private String empPassword;
private String empPhoneNo;
private int num;
}

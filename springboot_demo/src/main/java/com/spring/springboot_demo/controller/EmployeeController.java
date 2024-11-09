package com.spring.springboot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot_demo.Exception.DataAlreadyExistsException;
import com.spring.springboot_demo.entity.Employee;
import com.spring.springboot_demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
@PostMapping("/register")

	public Employee register(@RequestBody Employee employee) throws DataAlreadyExistsException {
		employeeService.register(employee);
		return employee;
	}
}

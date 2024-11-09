package com.spring.springboot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springboot_demo.Exception.DataAlreadyExistsException;
import com.spring.springboot_demo.entity.Employee;
import com.spring.springboot_demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	public Employee register(Employee employee) throws DataAlreadyExistsException {
		Employee emp=employeeRepository.findByEmpEmail(employee.getEmpEmail());
		if(emp!=null) {
			throw new DataAlreadyExistsException("Email already exists..."+emp.getEmpEmail());
		}
		employeeRepository.save(employee);
		return employee;
	}
}

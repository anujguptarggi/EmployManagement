package com.employ.ragistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployRepository employRepository;
	
	@Override
	public String welcomeMessage() {
		return "Welcome Anuj";
	}

	@Override
	public List<Employee> findAllEmp() {
		return employRepository.findAll();
	}

	@Override
	public Employee findEmp(Long id) {
		
		 return employRepository.findById(id).get();
		
	}
	@Override
	public Employee saveEmp(Employee employee) {
		employRepository.save(employee);
		return employee;
	}

}

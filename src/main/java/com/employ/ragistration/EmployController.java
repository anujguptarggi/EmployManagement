package com.employ.ragistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String home() {
		return employeeService.welcomeMessage();
	}

	@GetMapping("/emp")
	public List<Employee> getAllEmp() {

		return employeeService.findAllEmp();
	}

	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable Long id) {

		return employeeService.findEmp(id);
	}

	@PostMapping("/emp")
	public Employee saveEmp(@RequestBody Employee emp) {
		return employeeService.saveEmp(emp);
	}
}

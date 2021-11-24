package com.employ.ragistration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployController {

	@GetMapping("/")
	public String home()
	{
		return "Welcome Anuj";
	}
	@PostMapping("/emp")
	public Employee getEmp(@RequestBody Employee emp)
	{
		return emp;
	}
}

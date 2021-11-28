package com.employ.ragistration;

import java.util.List;

public interface EmployeeService {

	public String welcomeMessage();
	public List<Employee> findAllEmp();
	public Employee findEmp(Long id);
	public Employee saveEmp(Employee employee);
}

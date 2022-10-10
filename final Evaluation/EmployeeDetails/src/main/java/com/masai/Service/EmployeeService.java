package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.been.Employee;

@Component
public interface EmployeeService {

	public Employee createNewEmployee(Employee employee);
	
	public List<Employee> getListEmployee();
	
	public Employee getEmployeeById(Integer id);
	
	public Employee updateEmployeeById(Employee employee);
	
	public String deleteEmployeeById(Integer id);
	
	
	
}

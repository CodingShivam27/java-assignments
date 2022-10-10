package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EmployeeNotFoundException;
import com.masai.Service.EmployeeServiceImpl;
import com.masai.been.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> getAllEmpHandler(){
		return  new ResponseEntity<List<Employee>>(employeeServiceImpl.getListEmployee(),HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/api/employees/{id}")
	public ResponseEntity<Employee> getEmpByIdHandler(@PathVariable Integer id) throws EmployeeNotFoundException{
		return  new ResponseEntity<Employee>(employeeServiceImpl.getEmployeeById(id),HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/api/employees")
	public ResponseEntity<Employee> saveEmpHandler(@RequestBody Employee emp){
		return  new ResponseEntity<Employee>(employeeServiceImpl.createNewEmployee(emp),HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/api/employees/")
	public ResponseEntity<Employee> updateEmpHandler(@RequestBody Employee emp) throws EmployeeNotFoundException{
		return  new ResponseEntity<Employee>(employeeServiceImpl.updateEmployeeById(emp),HttpStatus.ACCEPTED);
	}
	
	

	@DeleteMapping("/api/employees/{id}")
	public ResponseEntity<String> deleteEmpHandler(@PathVariable Integer id) throws EmployeeNotFoundException{
		return  new ResponseEntity<String>(employeeServiceImpl.deleteEmployeeById(id),HttpStatus.ACCEPTED);
	}

}

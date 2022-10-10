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
import com.masai.Service.AddressServiceImpl;
import com.masai.Service.EmployeeServiceImpl;
import com.masai.been.Address;

@RestController
public class AddressController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@Autowired
	AddressServiceImpl addressServiceImpl;
	
	
	@GetMapping("/employees/{empId}/address")
	public ResponseEntity<List<Address>> getAllAddressByEmpIdHandler(@PathVariable Integer empId) throws EmployeeNotFoundException{
		return  new ResponseEntity<List<Address>>(addressServiceImpl.getAddressByEmpId(empId),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employees/{empId}/address/{id}")
	public ResponseEntity<Address> getAddressByEmpIdAndAdIdHandler(@PathVariable Integer empId,Integer id) throws Exception{
		return  new ResponseEntity<Address>(addressServiceImpl.getAddressByEmpIdAndAddId(empId, id),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/employees/{empId}/address")
	public ResponseEntity<String> saveAddressByEmpIdAndAdIdHandler(@PathVariable Integer empId, @RequestBody Address ad) throws Exception{
		return  new ResponseEntity<String>(addressServiceImpl.saveAddressByEmpId(ad, empId),HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/employees/{empId}/address")
	public ResponseEntity<String> updateAddressByEmpIdAndAdIdHandler(@PathVariable Integer empId, @RequestBody Address ad) throws Exception{
		return  new ResponseEntity<String>(addressServiceImpl.updateAddressByEmpId(ad, empId),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/employees/{empId}/address/{id}")
	public ResponseEntity<String> deleteAddressByEmpIdAndAdIdHandler(@PathVariable Integer empId, Integer id) throws Exception{
		return  new ResponseEntity<String>(addressServiceImpl.deleteAddressByEmpId(id, empId),HttpStatus.ACCEPTED);
	}

	
}

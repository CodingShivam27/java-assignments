package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.Exception.AddressNotFoundException;
import com.masai.Exception.EmployeeNotFoundException;
import com.masai.been.Address;
import com.masai.been.Employee;
import com.masai.repository.AddressDao;
import com.masai.repository.EmployeeDao;

public class AddressServiceImpl implements AddressService {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	AddressDao addressDao;
	
	@Override
	public List<Address> getAddressByEmpId(Integer empId) throws EmployeeNotFoundException {
		Employee emp = employeeServiceImpl.getEmployeeById(empId);
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		return emp.getAddress_id();
	}

	@Override
	public Address getAddressByEmpIdAndAddId(Integer empId, Integer address_id) throws Exception {
		Employee emp = employeeServiceImpl.getEmployeeById(empId);
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		for(Address a: emp.getAddress_id()) {
			if(a.getAddress_id()==address_id) {
				return a;
			}
		}
		 throw new AddressNotFoundException("Address not found");
	}

	@Override
	public String saveAddressByEmpId(Address ad,Integer empId) throws Exception {
		
		//Employee emp = employeeServiceImpl.getEmployeeById(empId);
		Optional<Employee> opt = employeeDao.findById(empId);
//		if(emp==null) {
//			throw new EmployeeNotfoundException("Employee not found");
//		}
		Employee emp = opt.get();
			List<Address> aList = emp.getAddress_id();
			aList.add(ad);
			emp.setAddress_id(aList);
		 //employeeServiceImpl.saveEmployee(emp);
		 employeeDao.save(emp);
		 return "Address saved "+ad;
	}

	@Override
	public String updateAddressByEmpId(Address ad,Integer empId) throws Exception {
		String msg = null;
		Employee emp = employeeServiceImpl.getEmployeeById(empId);
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		Optional<Address> opt = addressDao.findById(ad.getAddress_id());
		if(!opt.isPresent()) {
			 throw new AddressNotFoundException("Address not found");
		}
		List<Address> aList = emp.getAddress_id();
		if(aList.remove(opt.get())) {
			aList.add(ad);
			msg ="Address Updated "+ad;
		}
		return msg;
	}

	@Override
	public String deleteAddressByEmpId(Integer address_Id,Integer empId) throws Exception {
		String msg = null;
		Employee emp = employeeServiceImpl.getEmployeeById(empId);
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		Optional<Address> opt = addressDao.findById(address_Id);
		if(!opt.isPresent()) {
			 throw new AddressNotFoundException("Address not found");
		}
		List<Address> aList = emp.getAddress_id();
		if(aList.remove(opt.get())) {
			
			msg ="Address Deleted";
		}
		
		return msg;
		
	}


}

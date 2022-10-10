package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.Exception.EmployeeNotFoundException;
import com.masai.been.Address;

@Component
public interface AddressService {

	public List<Address> getAddressByEmpId(Integer empId) throws EmployeeNotFoundException;
	
	public Address getAddressByEmpIdAndAddId(Integer empId, Integer address_id) throws Exception;
	
	public String saveAddressByEmpId(Address ad,Integer empId) throws Exception;
	
	public String updateAddressByEmpId(Address ad,Integer empId) throws Exception;
	
	public String deleteAddressByEmpId(Integer address_Id,Integer empId) throws Exception;
	
}

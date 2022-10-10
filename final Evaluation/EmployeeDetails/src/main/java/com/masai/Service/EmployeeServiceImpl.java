package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.been.Employee;
import com.masai.repository.AddressDao;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	
	@Autowired
	private AddressDao addrdao;
	
	@Override
	public Employee createNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> opt = empdao.findById(employee.getEmployee_id());
		if(!opt.isPresent()) {
//			addrdao.save(employee.getAddress_id());
			return empdao.save(employee);
			
		}else {
			//return new throw 
		}
		return null;
	}

	@Override
	public List<Employee> getListEmployee() {
		// TODO Auto-generated method stub
		List<Employee> eList = empdao.findAll();
		if(eList.isEmpty()) {
			//return ("List is empty")
		}else {
			return eList;
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt = empdao.findById(id);
		if(opt.isPresent()) {
			//return new throw ("tutorial not found by this id: "+id);
			
		}else {
			return opt.get();
		}
		return null;
	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
		Optional<Employee> opt = empdao.findById(employee.getEmployee_id());
		if(opt.isPresent()) {
			return empdao.save(employee);
			
		}else {
			//return new throw ("tutorial not found by this id: "+tutorial.getId());
		}
		return null;
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		Optional<Employee> opt = empdao.findById(id);
		if(opt.isPresent()) {
			Employee e1 = opt.get();
			empdao.delete(e1);
			 return "Tutorial deleted Successfully by this id: "+id;
			
		}else {
			//return new throw ("tutorial not found by this id: "+id);
		}
		return null;
	}

	
	
}

package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;
import com.capgemini.repo.EmployeeRepo;

public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeRepo ep;
	

	public EmployeeServiceImplementation(EmployeeRepo ep) {
		super();
		this.ep = ep;
	}

	@Override
	public Employee createEmployee(String name,int id, Address address) {
		Employee e = ep.findById(id);
		if(e==null){
		Employee emp = new Employee();
		emp.setName(name);
		emp.setId(id);
		emp.setAddress(address);
		
		return ep.save(emp);
	}
		return null;
	}

	@Override
	public List<Employee> searchByName(String name) {
		return ep.findByName(name);
		
	
	}

}

package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.Employee;

public interface EmployeeService {
	public Employee createEmployee(String name,int id, Address address);
	public List<Employee> searchByName(String name);

}

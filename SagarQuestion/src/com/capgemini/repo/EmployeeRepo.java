package com.capgemini.repo;

import java.util.List;

import com.capgemini.bean.Employee;

public interface EmployeeRepo {
	Employee save(Employee emp);
	List<Employee> findByName(String name);
	public Employee findById(int id);

}

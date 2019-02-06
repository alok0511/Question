package com.capgemini.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.bean.Employee;

public class EmployeeRepoImplementation implements EmployeeRepo {
	public static Map<Integer, Employee> hm = new HashMap<>();
	
	@Override
	public Employee save(Employee emp){
		int id = emp.getId();
		hm.put(id, emp);
		return emp;
		
	}
	
	public List<Employee> findByName(String name) {
		List<Employee> emp= new ArrayList<>();
		
		for(Map.Entry<Integer,Employee> entry : hm.entrySet()) {
			if(entry.getValue().getName().equals(name)) {
				emp.add(entry.getValue());
			}
		}
		return emp;
	}

	@Override
	public Employee findById(int id){
		Employee emp = hm.get(id);
		return emp;
	}

}

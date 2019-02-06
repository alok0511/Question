package com.capgemini.view;

import java.util.List;

import com.capgemini.bean.Address;
import com.capgemini.bean.City;
import com.capgemini.bean.Country;
import com.capgemini.bean.Employee;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImplementation;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImplementation;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeRepo ep = new EmployeeRepoImplementation();
		EmployeeService es = new EmployeeServiceImplementation(ep);
		
		City bangalore = new City("Bangalore");
		City newYork = new City("New York");
		City paris = new City("Paris");
		
		Country india = new Country("India",bangalore);
		Country usa = new Country("USA",newYork);
		Country france = new Country("France",paris);
		
		es.createEmployee("Alok", 101, new Address("A-1",india));
		es.createEmployee("Shobhit", 102, new Address("B-1",usa));
		es.createEmployee("Aditya", 103, new Address("C-1",france));
		

		List<Employee> l1 = es.searchByName("Shobhit");
		for(Employee emp:l1) {
			System.out.println(emp);
		}
	}

}

package com.wipro.microservices.s;

public class SalaryProcessor {
	    public void processSalary(Employee employee) {
	        System.out.println("Processing salary for " + employee.getName() + ": $" + employee.getSalary());
	    }
	}



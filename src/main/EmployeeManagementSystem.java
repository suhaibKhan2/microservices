package main;

import java.util.Arrays;
import java.util.List;

import model.Developer;
import model.Employee;
import model.Manager;
import model.SecurityGuard;
import service.Payable;
import service.PayrollService;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Salman", 101, 60000);
        Employee developer = new Developer("Varun", 102, 40000);
        Employee securityGuard = new SecurityGuard("Dhanraj", 103, 30000);

        List<Employee> employees = Arrays.asList(manager, developer, securityGuard);

        // Perform Duties
        for (Employee emp : employees) {
            emp.performDuties();
        }

        // Payroll System
        Payable payroll = new PayrollService(employees);
        payroll.calculateSalary();
    }
}

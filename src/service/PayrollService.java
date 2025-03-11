package service;

import java.util.List;

import model.Employee;

public class PayrollService implements Payable {
    private List<Employee> employees;

    public PayrollService(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " (ID: " + emp.getId() + ") - Salary: Rs." + emp.getSalary());
        }
    }
}

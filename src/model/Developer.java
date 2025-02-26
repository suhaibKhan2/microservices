package model;

public class Developer extends Employee {
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is writing code.");
    }
}

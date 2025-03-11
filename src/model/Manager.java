package model;

public class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is managing the team.");
    }
}

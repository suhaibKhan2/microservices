package model;

public class SecurityGuard extends Employee {
    public SecurityGuard(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is guarding the premises.");
    }
}

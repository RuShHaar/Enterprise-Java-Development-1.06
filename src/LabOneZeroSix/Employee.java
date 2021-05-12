package LabOneZeroSix;

public class Employee {

    protected int salary;
    protected String name;
    protected int id;

    public Employee(int salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "Mitarbeiter: " + name + " mit der Mitarbeiternummer: " + id + " hat ein Gehalt von: " + salary;
    }
}

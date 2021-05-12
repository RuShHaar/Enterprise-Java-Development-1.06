package LabOneZeroSix;

public class Intern extends Employee {

    private final int SALARY_LIMIT = 20000;

    public Intern(int salary, String name, int id) {
        super(salary,name, id);
        if(salary>SALARY_LIMIT){
            this.salary = SALARY_LIMIT;
        }
        else this.salary=salary;
    }

    @Override
    public void setSalary(int salary) {
        if (salary > SALARY_LIMIT) {
            this.salary = SALARY_LIMIT;
        } else {
            super.setSalary(salary);
        }
    }
}


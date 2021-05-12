package LabOneZeroSix;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Employee employee1 = new Employee(35000, "Bob", 1234);
        Employee employee2 = new Employee(25600, "Frank", 2344);
        Employee employee3 = new Employee(12000, "Klaus", 2311);
        Employee employee4 = new Employee(68241, "Sabine", 43242);
        Employee employee5 = new Employee(23586, "Ellen", 1321);
        Employee employee6 = new Employee(36871, "Julia", 124);
        Employee employee7 = new Employee(25620, "Sören", 5423);
        Employee employee8 = new Employee(37000, "Heinz", 7452);
        Employee employee9 = new Employee(24000, "Manuel", 5234);
        Intern intern1 = new Intern(30000, "Susi", 999);

        String employees =
                        employee1.getEmployeeDetails() + "\n" +
                        employee2.getEmployeeDetails() + "\n" +
                        employee3.getEmployeeDetails() + "\n" +
                        employee4.getEmployeeDetails() + "\n" +
                        employee5.getEmployeeDetails() + "\n" +
                        employee6.getEmployeeDetails() + "\n" +
                        employee7.getEmployeeDetails() + "\n" +
                        employee8.getEmployeeDetails() + "\n" +
                        employee9.getEmployeeDetails() + "\n" +
                        intern1.getEmployeeDetails();

        try {
            FileWriter fr = new FileWriter("employees.txt");
            fr.write(employees);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(employees);
    }
}

package com.assignments;

class Employee {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name,
             String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String name,
                      String department, double salary) {
        super(employeeId, name, department, salary);
    }
}

class ContractEmployee extends Employee {
    int contractDuration;

    ContractEmployee(int employeeId, String name,
                     String department, double salary,
                     int contractDuration) {
        super(employeeId, name, department, salary);
        this.contractDuration = contractDuration;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Duration: "
                           + contractDuration + " months");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        PermanentEmployee p1 = new PermanentEmployee(103, "Priya", "IT", 50000);

        ContractEmployee c1 = new ContractEmployee(104, "Arun", "HR", 30000, 12);


        System.out.println("\n--- Permanent Employee ---");
        p1.displayDetails();

        System.out.println("\n--- Contract Employee ---");
        c1.displayDetails();
    }
}
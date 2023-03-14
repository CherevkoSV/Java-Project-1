package com.example.java_hw6;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private double salary;

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public Employee(String lastName, String firstName, String position, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}

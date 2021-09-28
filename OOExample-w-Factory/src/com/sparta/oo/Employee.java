package com.sparta.oo;

public class Employee extends Person{
    private String department;
    private double salary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void print(){
        System.out.println(firstName + " " + lastName + " " +
                department + " (" + salary +")");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // negative salaries not allowed
        if (salary < 0.0) return;
        // salary increases limited to 10%
        if (this.salary != 0.0 && salary > 1.1 * this.salary) return;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

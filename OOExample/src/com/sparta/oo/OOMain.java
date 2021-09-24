package com.sparta.oo;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class OOMain {
    public static void main(String[] args) {
        Person emp1 = new Employee();
//        emp1.firstName = "Hello"; not allowed, private access
//        emp1.setDepartment("Marketing");
        emp1.setFirstName("Ted");
        emp1.setLastName("Person");
//        emp1.setSalary(45000.0);
//        emp1.setSalary(50000.0);
//        emp1.print();
        Customer cust = new Customer();
        cust.setFirstName("Terry");
        // cust.print();
        System.out.println(emp1);
        System.out.println(cust);
        Queue<String> c = new ArrayDeque<>();
        c.
    }
}

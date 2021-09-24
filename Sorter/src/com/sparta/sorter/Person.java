package com.sparta.sorter;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Comparable<Person>, Serializable, Messageable {
    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        return firstName.length() == ((Person)o).firstName.length();
    }

    @Override
    public int hashCode() {
        return firstName.length();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getLastName().equals(o.getLastName()))
            return this.getFirstName().compareTo(o.getFirstName());
        else
            return this.getLastName().compareTo(o.getLastName());
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message to: " + getFirstName() + " " + getLastName());
    }
}

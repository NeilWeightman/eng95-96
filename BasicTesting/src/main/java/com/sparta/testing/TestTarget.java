package com.sparta.testing;

public class TestTarget {
    private String name;
    private int id;

    public TestTarget(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public TestTarget() {
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

    @Override
    public String toString() {
        return "TestTarget{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    // avoid void/zero-arg methods - hard to test
    public void printObject(){
        System.out.println("This is the object "+toString());
    }
}

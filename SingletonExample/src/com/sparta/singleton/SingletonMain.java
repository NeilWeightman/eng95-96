package com.sparta.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        MySingleton theInstance = MySingleton.getInstance();
        MySingleton anotherInstance = MySingleton.getInstance();

        System.out.println(theInstance);
        System.out.println(anotherInstance);
    }
}

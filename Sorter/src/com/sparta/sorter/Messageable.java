package com.sparta.sorter;

public interface Messageable {
    static int i = 0;
    void sendMessage();
    default void somefunction(){
        System.out.println("do something");
    }
    static void anotherFunction(){
        System.out.println("Static function");
    }
}

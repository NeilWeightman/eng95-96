package com.sparta.singleton;

public class MySingleton {
    private static MySingleton theInstance = null;
    private MySingleton() {
    }
    public static MySingleton getInstance(){
        // if the instance hasn't already been assigned a value, do so now
        if(theInstance==null)
            theInstance = new MySingleton();
        return theInstance;
    }
}

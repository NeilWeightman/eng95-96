package com.sparta.insurance;

import java.util.ArrayList;
import java.util.Date;

public class InsuranceApp {
    // a class is a type of object
    // an object is an instance of a class
    public static void main(String[] args) {
        // Policy p = new Policy(); can't create an instance of an abstract class
        ArrayList<Policy> thePolicies = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            if (Math.random() > 0.5){
                thePolicies.add(new LifePolicy(true));
            } else {
                thePolicies.add(new CarPolicy("random", Math.random()*1000.0,
                        Math.random()*10000.0, new Date(), new Vehicle()));
            }
        }
        for(Policy p: thePolicies) {
            p.processClaim(123.0, "Some reason or other");
            System.out.println(p);
        }
    }
}

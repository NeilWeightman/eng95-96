package com.sparta.insurance;

import java.util.ArrayList;
import java.util.Date;

public class CarPolicy extends Policy { // only have one superclass in Java
    private Vehicle theCar;

    public CarPolicy(String policyHolder, double premium,
                     double maxCover, Date renewalDate, Vehicle theCar) {
        super("Car", policyHolder, premium, maxCover, renewalDate);
        this.theCar = theCar;
    }

    public Vehicle getTheCar() {
        return theCar;
    }

    public void setTheCar(Vehicle theCar) {
        this.theCar = theCar;
    }

    @Override
    public boolean processClaim(double claimAmount, String claimReason) {
        System.out.println("Processing claim for car policy: " + claimReason);
        return claimAmount < getMaxCover();
    }

    @Override
    public String toString() {
        return "CarPolicy{" +
                "theCar=" + theCar +
                '}' + super.toString();
    }
}

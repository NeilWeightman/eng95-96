package com.sparta.insurance;

import java.util.Date;
import java.util.Objects;

public abstract class Policy {
    // state information - properties - data elements - instance variables
    // instance variables should normally be private (not public if at all possible)
    private String type;
    private String policyHolder;
    private double premium;
    private double maxCover;
    private Date renewalDate;
    // operations - methods - functions
    // methods should normally be public (private is also fine)

    // for constructors, they have to differ in terms of the number and types of the args
    public Policy(String type, String policyHolder, double premium, double maxCover, Date renewalDate) {
        this.type = type;
        this.policyHolder = policyHolder;
        this.premium = premium;
        this.maxCover = maxCover;
        this.renewalDate = renewalDate;
    }

    public Policy() {
    }

    @Override
    public boolean equals(Object o) {
        Policy policy = (Policy) o;
        return policy.getPolicyHolder().equals(getPolicyHolder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, policyHolder, premium, maxCover, renewalDate);
    }
    // abstract methods are only allowed in abstract methods in abstract classes
    public abstract boolean processClaim(double claimAmount, String claimReason); // abstract method
    public void setType(String newType){
        type = newType;
    }
    public String getPolicyHolder(){
        return policyHolder;
    }

    public String getType() {
        return type;
    }

    public void setPolicyHolder(String policyHolder) {
        // "this" refers to the current object
        this.policyHolder = policyHolder;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        // validation
        if (premium < 0.0)
            // report an error - exception
            this.premium = 0.0;
        else
            this.premium = premium;
    }

    public double getMaxCover() {
        return maxCover;
    }

    public void setMaxCover(double maxCover) {
        this.maxCover = maxCover;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "Policy type='" + type + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", premium=" + premium +
                ", maxCover=" + maxCover +
                ", renewalDate=" + renewalDate;
    }
}

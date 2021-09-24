package com.sparta.insurance;

import java.util.Date;

public class LifePolicy extends Policy {
    private boolean isSmoker;

    public LifePolicy(String policyHolder, double premium, double maxCover, Date renewalDate, boolean isSmoker) {
        super("Life", policyHolder, premium, maxCover, renewalDate);
        this.isSmoker = isSmoker;
    }

    public LifePolicy(boolean isSmoker) {
        this.isSmoker = isSmoker;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    @Override
    public boolean processClaim(double claimAmount, String claimReason) {
        System.out.println("Processing claim for life policy: " + claimReason);
        return claimAmount < getMaxCover();
    }

    @Override
    public String toString() {
        return "LifePolicy{" +
                "isSmoker=" + isSmoker +
                '}';
    }
}

package com.sparta.test;

import java.util.Scanner;

public class EnumTester {
    public enum DayOfWeek {SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
    public static void main(String[] args) {
        DayOfWeek dayOfWeek;
        Scanner scan = new Scanner(System.in);
        dayOfWeek = DayOfWeek.valueOf(scan.next());
        System.out.println(dayOfWeek.equals(DayOfWeek.MONDAY));
//        dayOfWeek = 1 + dayOfWeek;
        switch(dayOfWeek){
            case SATURDAY: case SUNDAY:
                System.out.println("It's the weekend");
                break;
            case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY:
                System.out.println("It's a weekday");
                break;
            case FRIDAY:
                System.out.println("Nearly the weekend!!!");
        }

    }
}

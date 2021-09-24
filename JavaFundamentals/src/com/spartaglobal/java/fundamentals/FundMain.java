package com.spartaglobal.java.fundamentals;

public class FundMain {
    // continents - Europe, Asia, Australasia, North America,
    // South America, Africa, Antarctica
    public enum Continent {EUROPE, ASIA, AUSTRALASIA, North_America,
        South_America, Africa, Antarctica};
    public static void main(String[] args) {
        String s = "madam"; // palindrome - same either way round
        String s2 = "hello"; // not a palindrome
        String s4 = "Madam";
        String s3 = "madam I'm adam";
        if ( isPalindrome(s)){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " isn't a palindrome");
        }

    }
    public static int factorial(int number){
        // when will this stop?
        if (number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
    public static int sumRange(int startInt, int endInt){
        // loops for, while, for...each, do...while
        // calculate the sum of all the ints from startInt to endInt inclusive
        int result = 0;
        if (endInt < startInt){
            IntPair thePair = swapInt(startInt, endInt);
            startInt = thePair.getFirst();
            endInt = thePair.getSecond();
        }
        for(int i = startInt; i <= endInt; ++i){
            result = result + i;
        }
        return result;
    }
    public static IntPair swapInt(int a, int b){
        return new IntPair(b, a);
    }
}

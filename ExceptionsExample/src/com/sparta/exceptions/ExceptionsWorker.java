package com.sparta.exceptions;

import java.text.DateFormat;
import java.text.ParseException;

public class ExceptionsWorker{
    void myFunc() throws ParseException, MyException{
        int a = 10;
        int b = 0;
        System.err.println("Hello");

        DateFormat df = DateFormat.getDateInstance();
//        int c = a/b;
//        System.out.println(c);
        try {
            // open a file
            // read from the file
            throw new MyException("Hello from my method!");
//            System.out.println(df.parse("2021-09-28"));
//            System.out.println("This is after the parse");
        } finally {
            //close the file
            System.out.println("This got executed");
        }
    }
}

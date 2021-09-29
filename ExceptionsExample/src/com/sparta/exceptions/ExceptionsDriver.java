package com.sparta.exceptions;

import java.text.DateFormat;
import java.text.ParseException;

public class ExceptionsDriver {
    public static void main(String[] args) {
        ExceptionsWorker worker = new ExceptionsWorker();
        try {
            worker.myFunc();
        } catch (ParseException|MyException e) {
            e.printStackTrace();
        }
    }
}

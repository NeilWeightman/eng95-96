package com.sparta.sorter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SorterApp {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(List.of("Luigi", "Miltos", "Denis", "Bilal", "Miles",
                "Vivian", "Kevin", "Bahir", "Anil"));
        ArrayList<Rectangle> rectList = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            rectList.add(new Rectangle(Math.random()*10.0, Math.random()*10.0));
        }
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Daniel", "White"));
        personList.add(new Person("Adam", "White"));
        personList.add(new Person("Zebedee", "White"));
        personList.add(new Person("Daniel", "Blue"));
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("07771898989"));
        phoneList.add(new Phone("07771333333"));
        phoneList.add(new Phone("07771444444"));
        phoneList.add(new Phone("07771555555"));
        Collections.sort(strList);
        Collections.sort(rectList);
        Collections.sort(personList);
        System.out.println(strList);
        System.out.println(rectList);
        System.out.println(personList);
        for(Messageable m: phoneList){
            m.sendMessage();
            m.somefunction();
        }
        Messageable.anotherFunction();
    }
}

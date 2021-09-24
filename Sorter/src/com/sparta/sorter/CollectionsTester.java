package com.sparta.sorter;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsTester {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Halil");
        mySet.add("Karina");
        mySet.add("Kevin");
        mySet.add("Luigi");
        mySet.add("Halil");
        System.out.println(mySet);

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Cathy", "French"));
        personSet.add(new Person("Danny", "Jew")); // depends on hashCode & equals
        personSet.add(new Person("Richard", "Gurney"));
        personSet.add(new Person("Zoe", "O"));
        System.out.println(personSet);

    }


//    public static void main(String[] args) {
//        ArrayList<String> myList = new ArrayList<>(50);
//        for(int i = 0; i < 40; i++){
//            myList.add("Hello " + i);
//        }
//        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println(myList.get(13));
//        myList.remove(13);
//        System.out.println(myList);
//        System.out.println(myList.get(13));
//        myList.add(13, "New Value");
//        System.out.println(myList);
//    }
}

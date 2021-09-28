package com.sparta.oo;

import java.util.Collection;
import java.util.Scanner;

public class OOMain {
    public static void main(String[] args) {
        System.out.println("Would you prefer ArrayList, HashSet or ArrayDeque?");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        CollectionFactory theFactory;
        switch(choice){
            case "ArrayList":  theFactory = new ArrayListCollectionFactory(); break;
            case "ArrayDeque": theFactory = new ArrayDequeCollectionFactory(); break;
            case "HashSet":    theFactory = new HashSetCollectionFactory(); break;
            default:           theFactory = null; break;
        }
        Collection<Person> personCollection = theFactory.getImplementation();
        personCollection.add(new Person("Miles", "Lowe"));
        personCollection.add(new Person("Luigi", "Puma"));
        System.out.println(personCollection);
    }

//    private static Collection<Person> collectionFactory(String choice) {
//        if (choice.equals("ArrayList"))
//            return new ArrayList<>();
//        else if (choice.equals("HashSet"))
//            return new HashSet<>();
//        else if (choice.equals("ArrayDeque"))
//            return new ArrayDeque<>();
//        else
//            return null;
//    }
}

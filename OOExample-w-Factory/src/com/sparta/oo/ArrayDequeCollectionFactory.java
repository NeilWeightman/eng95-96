package com.sparta.oo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDequeCollectionFactory implements CollectionFactory {
    @Override
    public Collection<Person> getImplementation() {
        return new ArrayDeque<>();
    }
}

package com.sparta.oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetCollectionFactory implements CollectionFactory {
    @Override
    public Collection<Person> getImplementation() {
        return new HashSet<>();
    }
}

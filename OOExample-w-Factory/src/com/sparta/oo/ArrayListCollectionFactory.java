package com.sparta.oo;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCollectionFactory implements CollectionFactory {
    @Override
    public Collection<Person> getImplementation() {
        return new ArrayList<>();
    }
}

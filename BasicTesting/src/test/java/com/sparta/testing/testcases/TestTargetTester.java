package com.sparta.testing.testcases;

import com.sparta.testing.TestTarget;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTargetTester {

    @Test
    public void testSetName(){
        TestTarget theTarget = new TestTarget();
        theTarget.setName("Halil");
        assertTrue(theTarget.getName().equals("Halil"));
    }
    @Test
    public void testToString(){
        TestTarget myTarget = new TestTarget("Bilal", 123);
        assertTrue(myTarget.toString().equals("TestTarget{name='Bilal', id=123}"));
    }

}

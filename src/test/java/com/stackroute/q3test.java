package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q3;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q3test {

    public static q3 dab;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dab = new q3();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dab = null;

    }
    @SuppressWarnings("deprecation")
    @Test

    public void testdoo(){

        assertEquals("testdoo() should return name"
                , "4", q3.doo("4"));
        assertEquals("testdoo() should return name .."
                , "65", q3.doo("65"));
        assertEquals("testdoo() should return name"
                , "0", q3.doo("0"));
    }





}
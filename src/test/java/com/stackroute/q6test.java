package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q3;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q6test {

    public static q6 dan;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dan = new q6();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dan = null;

    }
    @SuppressWarnings("deprecation")
    @Test

    public void testtellno(){

        String ress[]={"13","20"};

        assertEquals("testtellno() should retun value at which int overflow on integer"
                , ress, q6.tellno(""));


    }
}
package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q4test {

    public static q4 dap;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dap = new q4();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dap = null;

    }

    @SuppressWarnings("deprecation")
    @Test

    public void testiseven() {


        assertEquals("iseven() should return even or not, true here"
                , "true", q4.iseven("4"));
        assertEquals("iseven() should return even or not ,fa;se here"
                , "false", q4.iseven("65"));
        assertEquals("iseven() should return even or not ,true here"
                , "true", q4.iseven("0"));


    }
}


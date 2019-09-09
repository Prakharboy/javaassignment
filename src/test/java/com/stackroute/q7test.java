package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q3;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q7test {

    public static q7 dar;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dar = new q7();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dar= null;

    }
    @SuppressWarnings("deprecation")
    @Test

    public void testgetname(){


        assertEquals("send data and check on retrieval"
                , "prakhar", q7.getname("prakhar","bajpai","22","500000"));

        assertEquals("send to check age validity"
                , "invalid age age should be in range 18-60", q7.getname("prakhar","bajpai","70","500000"));
        assertEquals("send to check age validity"
                , "age cant be greater than 100 and less than 0", q7.getname("prakhar","bajpai","-5","500000"));



    }
}


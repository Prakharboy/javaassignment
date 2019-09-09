package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q1test {

    private static   q1 datac;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        datac = new q1();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        datac = null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testcheckpalin()
    {


        assertEquals("testcheckpalin() should return string is palindrome or not"
                , "notpalindrome", q1.checkpalin("hello"));
        assertEquals("testcheckpalin() should return string is palindrome or not"
                , "palindrome", q1.checkpalin("bob"));
        assertEquals("testcheckpalin() should return null if empty string"
                , "null", q1.checkpalin(""));


    }


}

package com.stackroute;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q2test {

    public static q2 datacc;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        datacc = new q2();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        datacc = null;

    }

    @SuppressWarnings("deprecation")
    @Test

    public  void testcheckpower()
    {

        assertEquals("testcheckpower() should return if npo is power of 4 correct"
                , "yes", q2.checkpower("4"));
        assertEquals("testcheckpower() should return if npo is power of 4 .."
                , "no", q2.checkpower("65"));
        assertEquals("testcheckpalin() should return no on 0"
                , "no", q2.checkpower("0"));
    }
}
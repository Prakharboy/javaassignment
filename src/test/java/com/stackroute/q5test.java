package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


import com.stackroute.q3;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class q5test {

    public static q3 dam;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dam = new q3();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dam = null;

    }
    @SuppressWarnings("deprecation")
    @Test

    public void testfindall(){

        int ab[]={56,76,1,89};
        int ac[]={};
        int ad[]={-1,0,7,102};

        String aba[]={"1","89","55"};
        String aca[]={"null","null","null"};
        String ada[]={"null","negative and greater than 100 not allowed"};

        assertEquals("testall() should return sum,min ,avg"
                ,aba, q5.findall(ab));
        assertEquals("testall() should return sum,min ,avg"
                , aca, q5.findall(ac));
        assertEquals("testall() should return sum,min ,avg"
                , ada, q5.findall(ad));



    }}

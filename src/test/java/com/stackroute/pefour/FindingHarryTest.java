package com.stackroute.pefour;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindingHarryTest {
    FindingHarry fh;
    @Before
    public void setUp() throws Exception {
     fh=new FindingHarry();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findingHarry() {
        assertEquals("Is Harry here ?"+true,"This is Harry");
        assertEquals("Is Harry here ?"+true,"He is playing with Harry's friend.");
        assertEquals("Is Harry here ?"+false,"This is Henry");
    }

    @Test
    public void findingHarryFailure(){
        assertNotSame(false,"This is Harry");
        assertNotSame(true,"This is Henry");
    }
}
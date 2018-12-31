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
        assertEquals("Is Harry here ?"+true,fh.findingHarry("This is Harry","Harry"));
        assertEquals("Is Harry here ?"+true,fh.findingHarry("He is playing with Harry's friend.","Harry"));
        assertEquals("Is Harry here ?"+false,fh.findingHarry("This is Henry","Harry"));
    }

    @Test
    public void findingHarryFailure(){
        assertNotSame(false,fh.findingHarry("This is Harry","Harry"));
        assertNotSame(true,fh.findingHarry("This is Henry","Henry"));
    }
}
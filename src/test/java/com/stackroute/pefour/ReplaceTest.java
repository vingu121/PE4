package com.stackroute.pefour;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace rp=new Replace();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void stringReplace1(){
        assertEquals("faity fry",rp.stringReplace("daily dry"));
    }
    public void stringReplace2(){
        assertEquals("flower",rp.stringReplace("dlower"));
    }
}
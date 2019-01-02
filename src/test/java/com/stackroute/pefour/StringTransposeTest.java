package com.stackroute.pefour;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose=new StringTranspose();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transpose() {

        //act
        String  expected = "a kciuq nworb xof spmuj revo eht yzal god";


        //arrange
        String result = stringTranspose.transpose("a quick brown fox jumps over the lazy dog");

        //assert
        assertEquals(expected,result);

    }

    @Test
    public void transpose1() {

        //act
        String  expected = "I ma toor";


        //arrange
        String result = stringTranspose.transpose("I am root");

        //assert
        assertEquals(expected,result);

    }

    @Test
    public void transpose2() {

        //act
        String  expected = "My name is Khan";


        //arrange
        String result = stringTranspose.transpose("My name is not Khan");

        //assert
        assertNotEquals(expected,result);
    }
}
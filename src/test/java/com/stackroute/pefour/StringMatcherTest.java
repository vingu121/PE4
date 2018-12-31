package com.stackroute.pefour;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {

    StringMatcher stringMatcher = new StringMatcher();
    @Test
    public void matchString1() {
        //act
        String expected = "found at: 4-6 found at: 10-12 found at: 25-27";
        //arrange
        String result = stringMatcher.matchString("She sells seashells by the seashore");
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void matchString2() {
        //act
        String expected = "found at: 2-4 found at: 5-7 found at: 23-25";
        //arrange
        String result = stringMatcher.matchString("This is the text which is to be searched");
        //assert
        assertEquals(expected,result);
    }


}
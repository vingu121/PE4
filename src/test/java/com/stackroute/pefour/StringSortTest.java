package com.stackroute.pefour;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortTest {
StringSort stringSort;
    @Before
    public void setUp() throws Exception {
        stringSort=new StringSort();
    }

    @After
    public void tearDown() throws Exception {
        stringSort=null;
    }

    @Test
    public void sortWordsOne() {
        String s = "elephant is a animal";
        String[] str = {"a", "animal", "elephant", "is"};
        String[] str1=stringSort.sortWords(s);
        assertArrayEquals(str, str1);
    }
    @Test
    public void sortWordsTwo() {
        String s = "I am Chandra Prakash Bommadevara";
        String[] str = {"am", "bommadevara", "chandra", "i","prakash"};
        String[] str1=stringSort.sortWords(s);
        assertArrayEquals(str, str1);
    }
    @Test
    public void sortWordsThree() {
        String s = "Happy New Year to IBMers";
        String[] str= {"happy","ibmers", "new", "to", "year"};
        String[] str1=stringSort.sortWords(s);
        assertArrayEquals(str, str1);
    }
    @Test
    public void sortWordsFour() {
        String s = "I'm so sleepy today I would like to take rest";
        String[] str = {"i","i'm","like","rest","sleepy","so","take","to","today","would"};
        String[] str1=stringSort.sortWords(s);
        assertArrayEquals(str, str1);
    }

    @Test
    public void sortWordsFive() {
        String s = "This test case is to check failure";
        String[] str = {"case","check","failure","is","test","to","this"};
        String[] str1=stringSort.sortWords(s);

        assertNotEquals(str, str1);
    }

}
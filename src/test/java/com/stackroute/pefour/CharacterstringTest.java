package com.stackroute.pefour;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterstringTest {

    Characterstring obj= new Characterstring();

    @Test
    public void characterString() {

        assertEquals(10, obj.characterString("Java is java again java again" , 'a'));
    }

    @Test
    public void characterString1() {
        assertEquals(4, obj.characterString("sea shells the shore", 's'));
    }
    @Test
    public void characterString2() {
        assertEquals(4, obj.characterString("cats camel chandu charger",'c'));
    }

    }

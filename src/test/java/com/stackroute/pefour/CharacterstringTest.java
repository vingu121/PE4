package com.stackroute.pefour;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterstringTest {

    Characterstring obj= new Characterstring();

    @Test
    public void characterString() {
        assertEquals(" count number of occurrence of a in the given string", obj.characterString("Java is java again java again"));
    }

    @Test
    public void characterString1() {
        assertEquals("s", obj.characterString("sea shells the shore"));
    }
    @Test
    public void characterString2() {
        assertEquals("c", obj.characterString("cats camel chandu charger"));
    }

    }

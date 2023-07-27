package com.example.personDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunit1 {

    @Test
    public void testAdd(){
        int num=5;
        String temp=null;
        String str="Junit is working fine";
assertEquals("Junit is working fine",str);
/*assertNotNull(temp);*/
assertFalse(num>6);

    }
}

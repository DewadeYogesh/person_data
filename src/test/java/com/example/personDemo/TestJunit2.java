package com.example.personDemo;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestJunit2 extends TestCase {

    protected  double fvalue1;
    protected  double fvalue2;
    @Before
    public void setUp(){
        fvalue1=5.0;
        fvalue2=10.0;
    }
@Test
    public void  testAdd(){
    System.out.println("no. of test cases counted "+this.countTestCases());

    System.out.println("Geting tesCase name "+this.getName());

    this.setName("newTestAdd");
    String newName=this.getName();
    System.out.println("Updated testcase name "+newName);




    }
    public void tearDown( ){
        System.out.println("Ended the TestJunit");

    }

}

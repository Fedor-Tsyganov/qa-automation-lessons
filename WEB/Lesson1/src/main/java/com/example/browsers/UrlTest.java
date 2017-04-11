package com.example.browsers;

import org.testng.Assert;
import org.testng.annotations.*;

public class UrlTest {

    @BeforeClass
    void myBeforeClassTest(){
        System.out.println("This is before class method");
    }

    @Test
    void myTest_1(){
        System.out.println("This is myTest_1() method");
        Assert.assertEquals(true, true);
    }

    @Test
    void myTest_2(){
        System.out.println("This is myTest_2() method");
        Assert.assertEquals(true, false);
    }

    @AfterClass
    void myAfterTest(){
        System.out.println("This is after class method");
    }
}

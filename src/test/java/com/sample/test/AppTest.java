package com.sample.test;

import org.testng.annotations.Test;

import com.sample.test.BaseClass;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseClass
{
   @Test
    public void test1()
    {
       System.out.println("Test1: "+driver.getCurrentUrl());
    }

    @Test
    public void test2()
    {
    	System.out.println("Test1: "+driver.getCurrentUrl());
    }
}

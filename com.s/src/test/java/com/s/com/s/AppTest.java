package com.s.com.s;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testdiv(){
    	int exp =5;
    	int act= App.division(25, 5);
    	assertEquals(exp, act);
    }
    public void testfaildiv(){
    	int exp =20;
    	int act= App.division(25, 5);
    	assertEquals(exp, act);
    }
    public void testadd(){
    	int exp =25;
    	int act= App.addition(20,5);
    	assertEquals(exp, act);
    }
    public void testfailadd(){
    	int exp =20;
    	int act= App.addition(20,5);
    	assertEquals(exp, act);
    }
    public void testmul(){
    	int exp =25;
    	int act= App.multiplication(5,5);
    	assertEquals(exp, act);
    }
    public void testfailmul(){
    	int exp =20;
    	int act= App.multiplication(5,5);
    	assertEquals(exp, act);
    }
    public void testsub(){
    	int exp =25;
    	int act= App.subtraction(30,5);
    	assertEquals(exp, act);
    }
    public void testfailsub(){
    	int exp =20;
    	int act= App.subtraction(5,5);
    	assertEquals(exp, act);
    }
}

package com.java.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class JavaTest extends TestCase
{

    public JavaTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite(JavaTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
}

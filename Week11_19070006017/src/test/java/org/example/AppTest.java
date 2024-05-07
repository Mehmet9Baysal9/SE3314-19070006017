package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Creates a new AppTest.
     *
     * @param testName the name of the test case
     */
    public AppTest(String testName)
    {
        super(testName);
    }

    /**
     * Returns the suite of tests being tested.
     *
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test.
     */
    public void testApp()
    {
        assertTrue(true);
    }
}

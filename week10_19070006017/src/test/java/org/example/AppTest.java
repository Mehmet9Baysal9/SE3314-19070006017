package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Constructor for AppTest class.
     *
     * @param testName The name of the test case.
     */
    public AppTest(final String testName) {
        super(testName);
    }

    /**
     * Returns the suite of tests being tested.
     *
     * @return The test suite.
     */
    public static TestSuite suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}



package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Student class.
 */
public class StudentTest {

    /**
     * Test for the getName method of the Student class.
     */
    @Test
    public void testGetName() {
        Student student = new Student("Bob Johnson", "004");
        assertEquals("Bob Johnson", student.getName());
    }

    /**
     * Constructor for the StudentTest class.
     */
    public StudentTest() {
        // Constructor body, şu anda boş
    }
}


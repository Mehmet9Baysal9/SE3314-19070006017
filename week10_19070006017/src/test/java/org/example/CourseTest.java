package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Course class.
 */
public class CourseTest {

    /**
     * Test for adding a student to the course.
     */
    @Test
    public void testAddStudent() {
        Course course = new Course("Mathematics", 30);
        Student student = new Student("Alice Smith", "003");
        course.addStudent(student);
        assertTrue(course.getStudents().contains(student));
    }

    /**
     * Constructor for the CourseTest class.
     */
    public CourseTest() {
        // Constructor body, şu anda boş
    }
}

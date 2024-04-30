package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the University class.
 */
public class UniversityTest {

    /**
     * Test for adding a course to the university.
     */
    @Test
    public void testAddCourse() {
        University university = new University();
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        assertEquals(1, university.getCourses().size());
    }

    /**
     * Test for registering a student for a course in the university.
     */
    @Test
    public void testRegisterStudentForCourse() {
        University university = new University();
        Student student = new Student("John Doe", "002");
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        assertTrue(course.getStudents().contains(student));
    }

    /**
     * Constructor for the UniversityTest class.
     */
    public UniversityTest() {
        // Constructor body, şu anda boş
    }
}


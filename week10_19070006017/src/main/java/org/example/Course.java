package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course offered by the university.
 */
public class Course {
    /**
     * Total number of courses.
     */
    private static int totalCourses = 0;

    /**
     * The name of the course.
     */
    private String courseName;

    /**
     * The maximum capacity of the course.
     */
    private final int capacity;

    /**
     * List of students enrolled in the course.
     */
    private List<Student> students = new ArrayList<>();

    /**
     * Constructor for the Course class.
     *
     * @param name     The name of the course.
     * @param capacity The maximum capacity of the course.
     */
    public Course(final String name, final int capacity) {
        courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is available capacity.
     *
     * @param student The student to add.
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity)
            students.add(student);
    }

    /**
     * Retrieves the name of the course.
     *
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Retrieves the total number of courses.
     *
     * @return The total number of courses.
     */
    public static int getTotalCourses() {
        return totalCourses;
    }

    /**
     * Retrieves the list of students enrolled in the course.
     *
     * @return The list of students enrolled in the course.
     */
    public List<Student> getStudents() {
        return students;
    }
}


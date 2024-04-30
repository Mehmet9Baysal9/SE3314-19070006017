package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a university entity that manages courses and student enrollments.
 */
public class University {
    /**
     * Mapping of course names to Course objects.
     */
    private final Map<String, Course> courses = new HashMap<>();

    /**
     * Constructor for University class.
     */
    public University() {
        // Constructor body, şu anda boş
    }

    /**
     * Add a course to the university.
     * This method is final and not designed for extension.
     *
     * @param course The course to add.
     */
    public final void addCourse(final Course course) {
        if (course != null && !courses.containsKey(course.getCourseName())) {
            courses.put(course.getCourseName(), course);
        }
    }

    /**
     * Register a student for a course.
     * This method is final and not designed for extension.
     *
     * @param student The student to register.
     * @param course The course to register the student for.
     */
    public final void registerStudentForCourse(final Student student, final Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Print the enrollments in each course.
     * This method is final and not designed for extension.
     */
    public final void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}








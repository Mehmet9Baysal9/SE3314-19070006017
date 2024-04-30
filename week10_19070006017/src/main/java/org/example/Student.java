package org.example;

/**
 * Represents a student entity with a name and ID.
 */
public class Student {
    /** The name of the student. */
    private final String studentName;

    /** The ID of the student. */
    private final String studentID;

    /**
     * Constructor for creating a student object.
     *
     * @param name The name of the student.
     * @param id The ID of the student.
     */
    public Student(final String name, final String id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Get the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return studentName;
    }
}


package org.example;

/**
 * Represents a book in the library.
 * This class provides methods to access the book's details such as title, author, ISBN, and its availability.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    /**
     * Constructs a new Book with the specified title, author, ISBN, and availability.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The International Standard Book Number of the book.
     * @param isAvailable The availability status of the book in the library.
     */
    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    /**
     * Returns the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Returns the availability status of the book.
     * @return true if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the book.
     * @param available The new availability status of the book.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

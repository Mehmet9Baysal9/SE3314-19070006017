package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of books in a library.
 * This class allows adding, searching, checking out, and returning books.
 */
public class Library {
    public List<Book> books = new ArrayList<>();

    /**
     * Adds a new book to the library.
     * @param b The book to be added to the library.
     * @throws IllegalArgumentException if the book object is null.
     */
    public void addBook(Book b) throws IllegalArgumentException {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(b);
    }

    /**
     * Searches for books by title or author.
     * @param query The search query which could be a title or an author's name.
     * @return A list of books that match the query.
     */
    public List<Book> searchBooks(String query) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Checks out a book from the library.
     * @param ISBN The ISBN of the book to check out.
     * @return The book if available and null otherwise.
     */
    public Book checkOutBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isAvailable()) {
                book.setAvailable(false);
                return book;
            }
        }
        return null;
    }

    /**
     * Returns a book to the library.
     * @param ISBN The ISBN of the book to return.
     */
    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                book.setAvailable(true);
            }
        }
    }
}

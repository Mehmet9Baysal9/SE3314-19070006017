package org.example;

import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        // Create an instance of Library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("1984", "George Orwell", "9780141036144", true));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", true));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "9780060850524", true));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", true));  // Another edition

        // Display all books
        System.out.println("Initial list of books:");
        for (Book book : library.books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN() + ", Available: " + book.isAvailable());
        }

        // Search for books by title
        System.out.println("\nSearching for '1984':");
        List<Book> foundBooks = library.searchBooks("1984");
        for (Book book : foundBooks) {
            System.out.println("Found - Title: " + book.getTitle() + ", ISBN: " + book.getISBN());
        }

        // Check out a book
        System.out.println("\nChecking out '1984' with ISBN 9780141036144:");
        Book checkedOutBook = library.checkOutBook("9780141036144");
        if (checkedOutBook != null) {
            System.out.println("Checked out - Title: " + checkedOutBook.getTitle() + ", ISBN: " + checkedOutBook.getISBN() + ", Available: " + checkedOutBook.isAvailable());
        }

        // Return a book
        System.out.println("\nReturning '1984' with ISBN 9780141036144:");
        library.returnBook("9780141036144");
        System.out.println("Returned - Title: " + checkedOutBook.getTitle() + ", ISBN: " + checkedOutBook.getISBN() + ", Available: " + checkedOutBook.isAvailable());

        // Check the status of all books again
        System.out.println("\nUpdated list of books:");
        for (Book book : library.books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN() + ", Available: " + book.isAvailable());
        }
    }
}

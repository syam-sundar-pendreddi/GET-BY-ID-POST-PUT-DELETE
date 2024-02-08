package com.example.goodreads;

import java.util.*;

public interface BookRepository {
    public ArrayList<Book> getBooks();

    public Book getBookById(int bookId);

    public Book addBook(Book book);

    public Book updateBook(int bookId, Book book);

    public void deleteBook(int bookId);
}
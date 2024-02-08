package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.goodreads.BookService;

@RestController
public class BookController {
  BookService bookService = new BookService();

  @PostMapping("/books")
  public Book addBook(@RequestBody Book book) {
    return bookService.addBook(book);
  }

  @GetMapping("/books")
  public ArrayList<Book> getBooks() {
    return bookService.getBooks();
  }

  @GetMapping("/books/{bookId}")
  public Book getBook(@PathVariable("bookId") int bookId) {
    return bookService.getBookById(bookId);
  }

  @PutMapping("/books/{bookId}")
  public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
    return bookService.updateBook(bookId, book);
  }

  @DeleteMapping("/books/{bookId}")
  public void deleteBook(@PathVariable("bookId") int bookId) {
    bookService.deleteBook(bookId);
  }

}
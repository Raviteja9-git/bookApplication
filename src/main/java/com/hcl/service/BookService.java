package com.hcl.service;

import com.hcl.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Book addBook(Book book);
    public void deleteBook(Long id);
    public List<Book> getAllBooks();
    public Optional<Book> getBookById(Long id);
    public Book updateBook(Book book);
}

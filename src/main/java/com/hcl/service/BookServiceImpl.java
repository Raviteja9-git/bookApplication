package com.hcl.service;

import com.hcl.entity.Book;
import com.hcl.repository.BookRepository;
import com.hcl.service.BookService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

	@Override
	public Book updateBook(Book book) {
		Optional<Book> byId = bookRepository.findById(book.getId());
		Book book2 = byId.get();
		BeanUtils.copyProperties(book, book2);
		return bookRepository.save(book2);
	}
}

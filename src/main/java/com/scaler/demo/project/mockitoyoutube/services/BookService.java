package com.scaler.demo.project.mockitoyoutube.services;

import com.scaler.demo.project.mockitoyoutube.models.Book;
import com.scaler.demo.project.mockitoyoutube.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    void addBook(Book book){
        bookRepository.save(book);
    }
    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }
}

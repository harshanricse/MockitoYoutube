package com.scaler.demo.project.mockitoyoutube.fakeTestDouble;

import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.EmailService;

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
    //other methods use EmailService
}

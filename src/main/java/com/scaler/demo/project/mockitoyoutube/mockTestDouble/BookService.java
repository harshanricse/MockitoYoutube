package com.scaler.demo.project.mockitoyoutube.mockTestDouble;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    void addBook(Book book){
        bookRepository.save(book);
    }
    //other methods use EmailService
}

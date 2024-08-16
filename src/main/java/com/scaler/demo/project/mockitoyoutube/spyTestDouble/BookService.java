package com.scaler.demo.project.mockitoyoutube.spyTestDouble;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    //other methods use EmailService
}

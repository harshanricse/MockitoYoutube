package com.scaler.demo.project.mockitoyoutube.dummyTestDouble;

public class BookService {
    private BookRepository bookRepository;
    private EmailService emailService;
    public BookService(BookRepository bookRepository, EmailService emailService){
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }
    void addBook(Book book){
        bookRepository.save(book);
    }
    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }
    //other methods use email service
}

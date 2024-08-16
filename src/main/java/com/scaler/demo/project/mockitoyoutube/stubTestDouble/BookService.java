package com.scaler.demo.project.mockitoyoutube.stubTestDouble;

import java.util.ArrayList;
import java.util.List;

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
    List<Book> getNewBookwithAppliedDiscount(int discountRate, int days){
        List<Book> newBooks = bookRepository.findNewBooks(days);
        for(Book book:newBooks){
            int currPrice = book.getPrice();
            int discount = (currPrice*discountRate)/100;
            int updatedPrice = currPrice-discount;
            book.setPrice(updatedPrice);
        }
        return newBooks;
    }
}

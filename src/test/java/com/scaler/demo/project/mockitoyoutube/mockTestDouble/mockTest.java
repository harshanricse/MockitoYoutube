package com.scaler.demo.project.mockitoyoutube.mockTestDouble;
import com.scaler.demo.project.mockitoyoutube.spyTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.spyTestDouble.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mockTest {
    @Test
    public void demoMock(){
        BookRepositoryMock bookRepositoryMock = new BookRepositoryMock();
        BookService bookService = new BookService(bookRepositoryMock);
        Book firstBook = new com.scaler.demo.project.mockitoyoutube.spyTestDouble.Book("1234","Mockito",250, LocalDate.now());
        bookService.addBook(firstBook);
        Book secondBook = new Book("1235","jUnit",200, LocalDate.now());
        bookService.addBook(secondBook);
        bookRepositoryMock.verify(2, secondBook);
    }
}

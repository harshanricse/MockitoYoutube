package com.scaler.demo.project.mockitoyoutube.fakeTestDouble;

import com.scaler.demo.project.mockitoyoutube.fakeTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.fakeTestDouble.BookService;
import com.scaler.demo.project.mockitoyoutube.fakeTestDouble.BookRepositoryTest;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {
    @Test
    public void testBookService(){
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        BookService bookService = new BookService(bookRepositoryTest);
        bookService.addBook(new Book("1234","Mockito",250, LocalDate.now()));
        bookService.addBook(new Book("1235","jUnit",200, LocalDate.now()));
        assertEquals(2, bookService.findNumberOfBooks());
    }
}

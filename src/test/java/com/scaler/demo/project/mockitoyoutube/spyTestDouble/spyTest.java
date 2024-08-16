package com.scaler.demo.project.mockitoyoutube.spyTestDouble;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class spyTest {
    @Test
    public void demoSpy(){
        BookRepositorySpy bookRepositorySpy = new BookRepositorySpy();
        BookService bookService = new BookService(bookRepositorySpy);
        Book firstBook = new Book("1234","Mockito",250, LocalDate.now());
        bookService.addBook(firstBook);
        Book secondBook = new Book("1235","jUnit",200, LocalDate.now());
        bookService.addBook(secondBook);
        assertEquals(2, bookRepositorySpy.timesCalled());
        assertTrue(bookRepositorySpy.calledWith(secondBook));
    }
}

package com.scaler.demo.project.mockitoyoutube.stubTestDouble;

import com.scaler.demo.project.mockitoyoutube.stubTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.stubTestDouble.BookService;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {
    @Test
    public void testBookService(){
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        BookService bookService = new BookService(bookRepositoryTest);
        List<Book> newBooks = bookService.getNewBookwithAppliedDiscount(10,7);
        assertEquals(2, newBooks.size());
        assertEquals(450,newBooks.get(0).getPrice());
        assertEquals(360,newBooks.get(1).getPrice());
    }
}

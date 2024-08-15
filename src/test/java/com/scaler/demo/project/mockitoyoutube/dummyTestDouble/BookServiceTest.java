package com.scaler.demo.project.mockitoyoutube.dummyTestDouble;

import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.BookService;
import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.EmailService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {
    @Test
    public void testBookService(){
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        EmailService emailService = new EmailServiceTest();
        BookService bookService = new BookService(bookRepositoryTest, emailService);
        bookService.addBook(new Book("1234","Mockito",250, LocalDate.now()));
        bookService.addBook(new Book("1235","jUnit",200, LocalDate.now()));
        assertEquals(2, bookService.findNumberOfBooks());
    }
}

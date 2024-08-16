package com.scaler.demo.project.mockitoyoutube.mockTestDouble;

import com.scaler.demo.project.mockitoyoutube.spyTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.spyTestDouble.BookRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryMock implements BookRepository {
    int saveCalled = 0;
    Book lastAddedBook = null;
    @Override
    public void save(com.scaler.demo.project.mockitoyoutube.spyTestDouble.Book book) {
        saveCalled+=1;
        lastAddedBook = book;
    }
    public void verify(int timesCalled, Book book){
        assertEquals(saveCalled, timesCalled);
        assertEquals(lastAddedBook, book);
    }

}

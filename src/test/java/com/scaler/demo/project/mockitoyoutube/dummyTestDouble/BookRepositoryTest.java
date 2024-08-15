package com.scaler.demo.project.mockitoyoutube.dummyTestDouble;

import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.Book;
import com.scaler.demo.project.mockitoyoutube.dummyTestDouble.BookRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryTest implements BookRepository {
    // In memory database, HashMap or List
    Map<String, Book> bookStore = new HashMap<>();
    @Override
    public void save(Book book) {
        bookStore.put(book.getBookId(), book);
    }

    @Override
    public List<Book> findAll() {
        return bookStore.values().stream().toList();
    }
}

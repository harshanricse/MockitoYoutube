package com.scaler.demo.project.mockitoyoutube.stubTestDouble;

import java.time.LocalDate;
import java.util.ArrayList;
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

    @Override
    public List<Book> findNewBooks(int days) {
        List<Book> newBooks = new ArrayList<>();
        newBooks.add(new Book("1234","Mockito",500, LocalDate.now()));
        newBooks.add(new Book("1235","jUnit",400, LocalDate.now()));
        return newBooks;
    }

}

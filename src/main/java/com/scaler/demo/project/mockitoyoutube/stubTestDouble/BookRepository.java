package com.scaler.demo.project.mockitoyoutube.fakeTestDouble;

import com.scaler.demo.project.mockitoyoutube.fakeTestDouble.Book;

import java.util.List;

public interface BookRepository{
    void save(Book book);
    List<Book> findAll();
}

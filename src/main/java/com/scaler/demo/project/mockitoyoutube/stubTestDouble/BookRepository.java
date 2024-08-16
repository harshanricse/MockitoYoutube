package com.scaler.demo.project.mockitoyoutube.stubTestDouble;

import java.util.List;

public interface BookRepository{
    void save(Book book);
    List<Book> findAll();
    List<Book> findNewBooks(int days);
}

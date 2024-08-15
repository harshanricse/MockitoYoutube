package com.scaler.demo.project.mockitoyoutube.dummyTestDouble;

import java.util.List;

public interface BookRepository{
    void save(Book book);
    List<Book> findAll();
}

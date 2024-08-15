package com.scaler.demo.project.mockitoyoutube.repository;

import com.scaler.demo.project.mockitoyoutube.models.Book;

import java.util.Collection;
import java.util.List;

public interface BookRepository{
    void save(Book book);
    List<Book> findAll();
}

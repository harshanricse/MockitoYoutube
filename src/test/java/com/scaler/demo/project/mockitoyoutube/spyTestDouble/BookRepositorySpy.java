package com.scaler.demo.project.mockitoyoutube.spyTestDouble;
public class BookRepositorySpy implements BookRepository{
    int saveCalled = 0;
    Book lastAddedBook = null;
    @Override
    public void save(Book book) {
        saveCalled+=1;
        lastAddedBook = book;
    }
    public int timesCalled(){
        return saveCalled;
    }
    public Boolean calledWith(Book book){
        return lastAddedBook.equals(book);
    }
}

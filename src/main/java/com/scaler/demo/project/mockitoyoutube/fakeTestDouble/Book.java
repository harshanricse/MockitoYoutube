package com.scaler.demo.project.mockitoyoutube.fakeTestDouble;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedDate;
}

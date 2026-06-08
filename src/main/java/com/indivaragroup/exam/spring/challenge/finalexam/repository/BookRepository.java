package com.indivaragroup.exam.spring.challenge.finalexam.repository;

import com.indivaragroup.exam.spring.challenge.finalexam.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public Optional<Book> findById(Integer id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }
}

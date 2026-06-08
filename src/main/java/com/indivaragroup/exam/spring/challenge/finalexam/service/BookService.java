package com.indivaragroup.exam.spring.challenge.finalexam.service;

import com.indivaragroup.exam.spring.challenge.finalexam.model.Book;
import com.indivaragroup.exam.spring.challenge.finalexam.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void adBook(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> findBook(Integer id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}

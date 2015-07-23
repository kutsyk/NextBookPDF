package com.nextbook.services;

import com.nextbook.domain.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: borsch
 * Date: 7/23/2015
 * Time: 8:12 PM
 */
@Service
public interface IBookProvider {

    boolean addBook(Book book);

    Book getBookById(int bookId);

    List<Book> getAllBooks();

    boolean deleteBook(Book book);

    boolean deleteBook(int bookId);

    Book updateBook(Book book);

}
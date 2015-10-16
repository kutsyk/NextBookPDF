package com.nextbook.dao;


import com.nextbook.domain.criterion.BookCriterion;
import com.nextbook.domain.pojo.Book;
import com.nextbook.domain.pojo.BookAuthor;
import com.nextbook.domain.pojo.BookKeyword;
import com.nextbook.domain.pojo.UserStarsBook;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: borsch
 * Date: 7/23/2015
 * Time: 4:45 PM
 */
public interface IBookDao {

    Book getBookById(int bookId);

    List<Book> getAllBooks();

    int getBooksQuantity();

    int getCountByCriterion(BookCriterion criterion);

    boolean deleteBook(int bookId);

    Book updateBook(Book book);

    boolean isbnExist(String isbn);

    List<Book> getBooksByCriterion(BookCriterion criterion);

    List<Book> getAllPublisherBooks(int publisherId);

    BookKeyword getBookToKeyword(int bookId, int keywordId);

    BookKeyword updateBookToKeyword(BookKeyword bookKeyword);

    boolean deleteBookToKeyword(int bookId, int keywordId);

    BookAuthor getBookToAuthor(int bookId, int authorId);

    BookAuthor updateBookToAuthor(BookAuthor bookAuthor);

    boolean deleteBookToAuthor(int bookId, int authorId);

    UserStarsBook userStarsBook(UserStarsBook userStarsBook);
}

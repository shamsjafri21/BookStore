package com.teknikality.BookStore.services;

import java.util.List;

import com.teknikality.BookStore.entities.Book;


public interface IBookStoreService {
	
	List<Book> getBooks();
	Book createBook(Book book);
	Book updateBook(int bookId, Book book);
	Book getBook(int bookId);
	boolean deleteBook(int bookId);


}

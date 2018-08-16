package com.cg.service;

import java.awt.print.Book; //packages

import java.util.Collection;
import java.util.Map;

import com.cg.pojo.Books;

public interface BookShopDAO { // interface
	Map<Integer, Books> allBooks(); // Map collection

	Collection<Books> viewBookCart();

	void removeBookCart(int BookId); // methods

	void addBookCart(Books books);
}

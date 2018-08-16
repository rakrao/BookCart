package com.cg.service;

import java.util.Collection; //packages

import com.cg.pojo.Books;

public interface BookShopService { // interface
	Collection<Books> allBooks();

	int addBookCart(int id);

	Collection<Books> viewBookCart(); // method declaration

	int removeBookFromCart(int BookId);

}

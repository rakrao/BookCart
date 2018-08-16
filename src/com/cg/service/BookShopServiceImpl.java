package com.cg.service;

import java.util.Collection; //packages

import com.cg.pojo.Books;

public class BookShopServiceImpl implements BookShopService { // implementing interface

	BookShopDAO bookShopDAO = new BookShopDAOImpl(); // object
	static int count = 0;

	public Collection<Books> allBooks() {

		return bookShopDAO.allBooks().values();
	}

	public int addBookCart(int id) {
		boolean check = true;
		count++;

		for (Books books : viewBookCart()) {
			if (books.getBookId() == id) {
				books.setCount(books.getCount() + 1); // logic
				check = false;
				break;
			}
		}
		if (check) {
			bookShopDAO.addBookCart(bookShopDAO.allBooks().get(id));
		}
		return count;
	}

	public Collection<Books> viewBookCart() { // method definition

		return bookShopDAO.viewBookCart();
	}

	public int removeBookFromCart(int BookId) {
		return 0;
	}

}

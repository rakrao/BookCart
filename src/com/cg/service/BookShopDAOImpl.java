package com.cg.service;

import java.awt.print.Book; //packages
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.pojo.Books;

public class BookShopDAOImpl implements BookShopDAO { // implementing interface
	static Map<Integer, Books> bookMap = new HashMap<>(); // collection declaration
	static List<Books> bookList = new ArrayList<Books>();

	static Books book1 = new Books(101, "E Balaguruswamy", "Object Oriented Programming C++", "eb.jpg", "C++", 348, 1); // Objects
	static Books book2 = new Books(102, "Dennis Ritche", "The C language", "dr.jpg", "C", 223, 1);

	static {
		bookMap.put(book1.getBookId(), book1);
		bookMap.put(book2.getBookId(), book2); // passing value to collection
	}

	@Override
	public Map<Integer, Books> allBooks() {
		// TODO Auto-generated method stub
		return bookMap;
	}

	@Override
	public void addBookCart(Books book) {
		bookList.add(book);

	}

	@Override
	public Collection<Books> viewBookCart() { // defining methods
		// TODO Auto-generated method stub
		return bookList;
	}

	@Override
	public void removeBookCart(int BookId) {
		bookMap.remove(BookId);

	}

}

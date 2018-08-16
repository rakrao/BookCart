package com.cg.pojo;//package

public class Books {
	private int bookId;
	private String bookName;
	private String authorName; // instance members
	private String description;
	private String link;
	private int price;
	private int count;

	public Books(int bookId, String bookName, String authorName, String description, String link, int price,
			int count) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description; // constructor
		this.link = link;
		this.price = price;
		this.count = count;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) { // getters and setters
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() { // to string method
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", description="
				+ description + ", link=" + link + ", price=" + price + ", count=" + count + "]";
	}

}

package com.controller;

import java.io.IOException; //packages

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.service.BookShopService;
import com.cg.service.BookShopServiceImpl;

/**
 * Servlet implementation class BookShopController
 */
@WebServlet("*.app")
public class BookShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookShopController() { // constructor
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookShopService bookShopService = new BookShopServiceImpl();
		HttpSession session = request.getSession(); // do get method
		String action = request.getServletPath();

		switch (action) { // switch case
		case "/books.app":
			session.setAttribute("books", bookShopService.allBooks());
			response.sendRedirect("books.jsp");
			break;

		case "/add.app":
			int id = Integer.parseInt(request.getParameter("bookId"));
			System.out.println(id);
			int cartcount = bookShopService.addBookCart(id);
			session.setAttribute("cartC", cartcount);
			System.out.println(bookShopService.viewBookCart());
			response.sendRedirect("books.jsp");
			break;

		case "/view.app":
			System.out.println(bookShopService.viewBookCart());
			session.setAttribute("cart", ((BookShopService) bookShopService).viewBookCart());
			response.sendRedirect("cart.jsp");
			break;

		case "/remove.app":
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); // do post method
	}

}

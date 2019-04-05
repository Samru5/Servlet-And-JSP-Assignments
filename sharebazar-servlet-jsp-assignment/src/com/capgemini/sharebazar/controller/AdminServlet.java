package com.capgemini.sharebazar.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/admin" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();
		System.out.println(path);
		response.setContentType("text/html");
		if (path.equals("/admin")) {
			ServletContext context = getServletContext();
			
			String emailId = request.getParameter("email");
			String password = request.getParameter("password");

			context.setAttribute("Email", emailId);
			context.setAttribute("Password", password);
			response.sendRedirect("share");

		

		}

	}
}

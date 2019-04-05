package com.capgemini.newspaper.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/news" }, loadOnStartup = 1, name = "newsServlet")
public class NewsPaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewsPaperServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String name = request.getParameter("paper");

		if (name.equals("toi")) {
			response.sendRedirect("https://timesofindia.indiatimes.com/");
		}

		else if (name.equals("economictimes")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");

		}

		else if (name.equals("maharashtratimes")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");

		}

		else if (name.equals("dna")) {
			response.sendRedirect("https://www.dnaindia.com/");

		}

	}

}

package com.capgemini.creditcarddetails.controller;

import java.io.IOException;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "*.do" }, loadOnStartup = 1)
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static final Logger logger = Logger.getLogger(CreditCardServlet.class);

public CreditCardServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		System.out.println(path);
		if(path.equals("/credit.do"))
		{
		long creditNumber=Long.parseLong(request.getParameter("credit number"));
		String name=request.getParameter("customerName");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request, response);
		
	}
	}
}

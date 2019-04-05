package com.capgemini.creditcard.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/credit" }, loadOnStartup = 1 ,name="creditServlet")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CreditCardServlet() {
        super();
    }

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String path = request.getServletPath();
	System.out.println(path);
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	if(path.equals("/credit"))
	{
	long creditNumber=Long.parseLong(request.getParameter("creditnumber"));

	String name=request.getParameter("customername");

	long cvv=Long.parseLong(request.getParameter("cvv"));

	String expiryDate=request.getParameter("expirydate");
	
	out.println("<h4>");
	 out.println("Credit card number is:"   + creditNumber);

	out.println("Customer name  is: "+name);
	 out.println("<br>");


	out.println("Cvv  is: "+cvv);
	 out.println("<br>");


	out.println("Expiry date   is: "+expiryDate);

	out.println("</h4>");


	
}

}
}

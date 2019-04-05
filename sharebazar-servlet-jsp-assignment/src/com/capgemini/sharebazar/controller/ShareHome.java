package com.capgemini.sharebazar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/share"})
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShareHome() {
        super();
    }
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 out.println(getServletContext().getAttribute("Email"));
		 response.sendRedirect("Home.jsp");


	}

}

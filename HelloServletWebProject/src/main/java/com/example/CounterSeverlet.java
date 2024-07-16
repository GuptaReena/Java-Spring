package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CounterSeverlet
 */
public class CounterSeverlet extends HttpServlet {
	
	private int counter;
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("Counter servlet Init method called......");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Counter servlet do get method called .........");
		
		response.setContentType("text/html");
		PrintWriter printWriter =  response.getWriter();
		counter ++  ;
		printWriter.println("<h3>You have visited " + counter + "times </h3>");
	}

	
	@Override
	public void destroy() {
		System.out.println("Counter servlet destroy method called");
	}

}

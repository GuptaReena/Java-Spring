package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user =  request.getParameter("user");
		String pass = request.getParameter("pass");
		
		
		PrintWriter printWriter = response.getWriter();
		
		if("admin".equals(user) && "admin".equals(pass)) {
			printWriter.println("Login SuccessFul!!");
		}else {
			printWriter.println("Login Failed!!");
		}	
		
		response.setContentType("text/html");
		printWriter.println("<p><a href =\"Login.html\">Back to Login page</a></p>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
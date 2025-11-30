package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("<h1>Byeeeeeeee</h1>");
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1>Byeeeeeeee</h1>");
	}
	
}


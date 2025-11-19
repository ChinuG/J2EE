package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("n");
		String phone = req.getParameter("p");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1> Name : " + name + " </h1>");
		pw.print("<h1>Phone No. : " + phone + "</h1>");
	}
}

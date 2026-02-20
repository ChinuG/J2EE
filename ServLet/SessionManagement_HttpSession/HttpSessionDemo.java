package com.jsp.servlet.sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/session")
public class HttpSessionDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession s = req.getSession();
		Student stud1 = new Student(101, "Shyam");
		
		s.setAttribute("Student", stud1);
		String id = s.getId();
		
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>" + id + "</h1>");
		pw.write("<h1> Session got Expired</h1>");
		
		resp.sendRedirect("demo");
	}
}

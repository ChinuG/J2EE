package com.jsp.servlet.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Demo")
public class Demo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie c1 = new Cookie("user", "postgres");
		Cookie c2 = new Cookie("pass", "root");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		resp.sendRedirect("Test");
	}
}

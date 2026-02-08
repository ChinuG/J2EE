package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/submit")
public class extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
	
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
	}

}

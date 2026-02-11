package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/accept")
public class RequestRecognize extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		HttpServletRequest hsr = (HttpServletRequest) req;
		String request = hsr.getMethod();
		
		if(request.equals("GET"))
		{
			System.out.println("GET type of request is comming..");
		}
		else if(request.equals("POST"))
		{
			System.out.println("POST type of request is comming..");
		}
		else
		{
			System.out.println("Other request..");
		}
	}
}

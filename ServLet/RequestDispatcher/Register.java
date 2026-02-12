package Registeration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class Register extends HttpServlet{
	public static String email ;
	public static String pass;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		email = req.getParameter("email");
		pass = req.getParameter("pass");
		String number = req.getParameter("number");
		
		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd;
		
//		if(fName.length() > 8 && lName.length() > 8 && email.endsWith("@gmail.com") && pass.length() > 8)
		if(email.endsWith("@gmail.com") && pass.length() > 8)
		{
			rd = req.getRequestDispatcher("Login.html");
			rd.forward(req, resp);
		}
		else
		{
			rd = req.getRequestDispatcher("Register.html");
			pw.write("<h1> Invalid Credentials</h1>");
			rd.include(req, resp);
		}
		
//		pw.write("<h1>First Name : " + fName + "</h1>");
//		pw.write("<h1> Last Name : " + lName + "</h1>");
//		pw.write("<h1> Email Id : " + email + "</h1>");
//		pw.write("<h1> Password : " + pass + "</h1>");
//		pw.write("<h1> Contact No. : " + number + "</h1>");
	}
}

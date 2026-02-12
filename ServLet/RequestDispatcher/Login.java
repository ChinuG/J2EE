package Registeration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accept")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		String loginEmail = req.getParameter("email");
		String loginPass = req.getParameter("pass");
		
		RequestDispatcher rd;
		PrintWriter pw = resp.getWriter();
		
		if(loginEmail.equals(Register.email) && loginPass.equals(Register.pass))
		{
			rd = req.getRequestDispatcher("Home.html");
			rd.forward(req, resp);
		}
		else
		{
			rd = req.getRequestDispatcher("Login.html");
			
			pw.write("<h1>Invalid credentials</h1>");
			rd.include(req, resp);
		}
	}
}

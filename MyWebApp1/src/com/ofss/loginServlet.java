package com.ofss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String un=request.getParameter("un");
		String pass=request.getParameter("pass");
		if(un!=""&&pass!="") {
			if(un.equals(pass))
			{
				pw.write("Successfully Registered...");
			}
			else
			{
				pw.println("<h4 style='color:red'>Please enter right username and password</h4>");
			}
		}
		else
		{
			pw.println(
					"<!DOCTYPE html>"
					+"<html>"
					+"<body style='background-color:yellow'>"
					+"<h1 style='color:red'  > please enter username and password both</h1>"
					+"</body>"
					+"</html>"
					);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.learning.helloservletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/demo")	//declarative URL
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String val=request.getParameter("usrName");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Welcome "+val+"</h2>");
		out.println("<h2>This is doGet method</h2>");
		out.println("<a href='SampleServlet'>Go To Next Servlet</a>");
		//RequestDispatcher helps to pass request to further servlet
		RequestDispatcher rd=request.getRequestDispatcher("SampleServlet");
		
		//passing value as part of request using key-value pair
		request.setAttribute("userVal", val);
		
		//forwarding request along with object of RequestDispatcher
		//rd.forward(request, response);
		
		//including response from another servlet in this servlet
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>This is doPost method</h2>");
	}

}

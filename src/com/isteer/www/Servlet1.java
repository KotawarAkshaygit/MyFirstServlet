package com.isteer.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class Servlet1 extends HttpServlet {
	
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	int i=Integer.parseInt(request.getParameter("a"));
	int j=Integer.parseInt(request.getParameter("b"));
	
	int k= i+j;
	
	PrintWriter pw=response.getWriter();
	pw.print(k);

	System.out.println("Second commit");
}
}

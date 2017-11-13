package com.bsl.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	
	public static final String DBRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_test";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String cell = request.getParameter("cell");
			
			Method md = new Method();
			try {
				md.insert(name,age,cell);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			/*ServletContext context = getServletContext();
			RequestDispatcher rd =context.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);*/
			response.sendRedirect("/Test/index.jsp");
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			doPost(request, response);
		}
}

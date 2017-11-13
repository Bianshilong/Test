package com.bsl.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("all")
@WebServlet("/Update2")
public class Update2 extends HttpServlet {
	public static final String DBRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_test";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DBRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "update ";
		try {
			conn=DriverManager.getConnection(DBURL,DBUSER,DBPWD);
			st = conn.createStatement();
			rs= st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

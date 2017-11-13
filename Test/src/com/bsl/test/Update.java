package com.bsl.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("all")
@WebServlet("/Servlet/Update")
public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>更新用户的信息</h>");
		
		out.println("<form action=>");
		out.println("需要更新的ID:<input type=\"text\"></br>");
		out.println("需要更新的姓名:<input type=\"text\"></br>");
		out.println("更新后的年龄:<input type=\"text\"></br>");
		out.println("更新后的手机号码:<input type=\"text\"></br>");
		out.println("<input type=\"submit\">&nbsp;&nbsp;");
		out.println("<input type=\"reset\">");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

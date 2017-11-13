package com.bsl.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Method md = new Method();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("<table border='1'>");
		out.println("<tr><td colspan='6'>用户列表</td></tr>");
		out.println("<tr>");
		out.println("<td>批量操作</td>");
		out.println("<td>ID</td>");
		out.println("<td>姓名</td>");
		out.println("<td>年龄</td>");
		out.println("<td>手机号</td>");
		out.println("<td>可执行操作</td>");
		out.println("</tr>");
		try {
			ArrayList list = md.findAll();
		for (int i = 0; i < list.size(); i++) {
			UserInfo user = (UserInfo) list.get(i);
			out.println("<tr>");
			out.println("<td>");
			out.println("<input type=\"checkbox\" name =\"duoxuan\">");
			out.println("</td>");
			out.println("<td>" + user.getId() + "</td>");
			out.println("<td>" + user.getName() + "</td>");
			out.println("<td>" + user.getAge() + "</td>");
			out.println("<td>" + user.getCell() + "</td>");
			out.println("<td>");
			out.println("<a href='/Test/Delete?id=<%=user.getId()%>'>");
			out.println("删除</a>");
			out.println("<a href='/Test/Servlet/Update'>");
			out.println("更新</a>");
			out.println("</td>");
			out.println("</tr>");
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</table>");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}

package com.bsl.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Update2")
public class Update2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//暂时不能修改序号
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String cell = request.getParameter("cell");
		UserInfo user = new UserInfo();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setCell(cell);
		Method md = new Method();
		try {
			md.update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/Test/index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

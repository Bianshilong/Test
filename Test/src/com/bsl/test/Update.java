package com.bsl.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
@SuppressWarnings("all")
@WebServlet("/Servlet/Update")
public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Method md = new Method();
		int oldid =Integer.parseInt(request.getParameter("oldid"));
		String name = null;
		String age=null;
		String cell=null;
		int id=0;
		try {
			UserInfo user = md.findById(oldid);
			id = user.getId();
			name = user.getName();
			age = user.getAge();
			cell = user.getCell();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>更新用户的信息</h>");
		
		out.println("<form method =\"post\" action=\"/Test/Update2\">");
//		out.println("<form method =\"post\"");
		out.println("需要更新的ID:<input type=\"text\" value=\""+id+"\" name= \"id\" readonly=\"readonly\"></br>");
		out.println("需要更新的姓名:<input type=\"text\" value=\""+name+"\" name= \"name\"></br>");
		out.println("更新后的年龄:<input type=\"text\" value=\""+age+"\" name= \"age\"></br>");
		out.println("更新后的手机号码:<input type=\"text\" value=\""+cell+"\" name= \"cell\"></br>");
		out.println("<input type=\"submit\">&nbsp;&nbsp;");
		out.println("<input type=\"reset\">");
		out.println("</form>");
		
//		try {
//			UserInfo user2 = md.findById(id);
//			md.update(user2);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

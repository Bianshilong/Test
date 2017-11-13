package com.bsl.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("all")
@WebServlet("/DeleteMore")
public class DeleteMore extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String[] str = request.getParameterValues("id");
		String ids = "";
		for (String st : str) {
			ids=ids+st+",";
		}
		ids=ids.substring(0, ids.length()-1);
		System.out.println(ids);
		Method md = new Method();
		try {
			md.removeMore(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

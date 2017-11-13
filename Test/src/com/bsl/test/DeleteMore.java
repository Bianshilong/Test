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
		//取得查询串，并通过字符串函数转换成数组
		String str = request.getQueryString();
		String[] st = new String(str).split("&");
		for (int i = 0; i < st.length; i++) {
			st[i] = st[i].substring(8);
		}
		//将获得的结果拼接成字符串
		String ids = "";
		for (int i = 0; i < st.length; i++) {
			ids = ids+st[i]+",";
		}
		ids=ids.substring(0, ids.length()-1);
		Method md = new Method();
		try {
			md.removeMore(ids);
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

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
		Method md = new Method();
		int len = 0;
		try {
			len = md.findAll().size();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 取得提交的id值的数组
		String[] str = request.getParameterValues("duoxuan");
		String ids = "";
		if (str.length < len) {
			// 将获得的结果拼接成字符串,作为查询条件
			StringBuffer sb = new StringBuffer();
			int length = str.length - 1;
			for (int i = 0; i <= length; i++) {
				if (i < length) {
					sb.append(str[i]).append(",");
				} else {
					sb.append(str[i]);
				}
			}
			ids = "delete from info where id in (" + sb.toString() + ")";
		} else {
			ids = "delete from info";
		}
		try {
			md.removeMore(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/Test/index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

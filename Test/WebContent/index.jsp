<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="fifth/add.jsp">添加用户</a>
	<%
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/Select");
		rd.include(request, response);
	%>
</body>
</html>
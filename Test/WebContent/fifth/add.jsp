<%@page import="com.bsl.test.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>请输入要添加的用户信息</h2>
	<form method="post" action="<%= request.getContextPath()%>/Insert">
		姓&nbsp;&nbsp;名:<input type="text" name ="name"/></br>
		年&nbsp;&nbsp;龄:<input type="text" name ="age"/></br>
		手机号:<input type="text" name ="cell"/></br>
		<input type="submit" />&nbsp;<input type="reset"/>
	</form>
</body>
</html>
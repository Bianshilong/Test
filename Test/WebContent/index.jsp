<%@page import="java.util.ArrayList"%>
<%@page import="com.bsl.test.Method"%>
<%@page import="com.bsl.test.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
#tb1{border-collapse:collapse;width:50%}
</style>
<%
	Method md = new Method();
	ArrayList list = md.findAll();
%>
<title>Insert title here</title>
</head>
<body>
<h1>   &nbsp;</h1>
<h1>   &nbsp; </h1>
	<form id = "form1" method = "post" action="/Test/DeleteMore" align="center">
		<table id ="tb1" border='1' align="center">
			<tr>
				<td colspan="6">用户列表</td>
			</tr>
			<tr>
				<td>批量操作</td>
				<td>ID</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>手机号</td>
				<td>可执行操作</td>
			</tr>
		<%for (int i = 0; i < list.size(); i++) {
			UserInfo user = (UserInfo) list.get(i); %>
			<tr>
				<td><input type="checkbox" name="duoxuan" value="<%=user.getId()%>" /></td>
				<td><%=user.getId() %></td>
				<td><%=user.getName() %></td>
				<td><%=user.getAge() %></td>
				<td><%=user.getCell() %></td>
				<td>
					<a href="/Test/Delete?id=<%=user.getId()%>">删除</a>
					<a href="/Test/Servlet/Update?oldid=<%=user.getId()%>">更新</a>
				</td>
			</tr>
			<%} %>
		</table>
		<a href="fifth/add.jsp" >添加用户</a><input type="submit" value="删除所有勾选的" />
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!-- id , pw 가져오기 -->
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("user_id");
	String pw = request.getParameter("user_pw");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>result JSP</title>
</head>
<body>
	<h1>Login result</h1>
	<h2>ID : <%= id %></h2>
	<h3>PW : <%= pw %></h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");
   String name = request.getParameter("name");
   String imgName = request.getParameter("imgName");
%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>듀크이미지</title>
	</head>
	<body>
		<h1>내 이름은 <%=name%>다.</h1><br><br>
		<img src="img/<%=imgName%>" />
	</body>
</html>
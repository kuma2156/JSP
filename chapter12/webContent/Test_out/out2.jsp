<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name  = request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>out test</title>
</head>
<body>
	<!-- 표현식으로 출력 -->
	<% if(name != null && name.length() != 0){%>
		<h1><%=name %>,<%=age %></h1>
	<% }else {%>
		<h1>이름을 입력하세요</h1>
	<% } %>
	
	<!-- out 객체로 출력 -->
	<% if(name != null && name.length() != 0){%>
		<h1><% out.println(name + ", " + age); %></h1>
	<% }else {%>
		<h1>이름을 입력하세요</h1>
	<% } %>
	 
</body>
</html>
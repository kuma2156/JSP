<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
    
<%
	// getAttribute()로 바인딩 값 가져옴
	String name = (String) session.getAttribute("name");
	String address = (String) application.getAttribute("address");
	// apptest1 을 실행시지키 않고 apptest2를 실행시킨 결과 값은 세션값은 가져오지 못하지만 어플리캐이션이면 값을 가져온다
	// 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>두 번째 jsp</title>
</head>
<body>
	<h1> 이름은 <%= name %></h1>
	<h1> 주소는 <%= address %></h1>
</body>
</html>
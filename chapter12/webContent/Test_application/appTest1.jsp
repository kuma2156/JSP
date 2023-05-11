<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
    
 <%
 	//session 과 application 내장 객체에 바인딩
 	session.setAttribute("name","쿠마");
 	application.setAttribute("address","우주센터");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>내장 객체 스코프 테스트1</title>
</head>
<body>
	<h1>이름과 주소를 저장합니다.</h1>
	<a href=appTest2.jsp> 두 번째 웹피이지로 이동</a>
</body>
</html>
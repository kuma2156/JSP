<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  	request.setCharacterEncoding("utf-8");
	
	// request 내장객체에 바인딩
	request.setAttribute("id", "coffee");
	request.setAttribute("pwd", "9889");
	// session 내장 객체에 바인딩
	session.setAttribute("name", "아메리카노");
	//application 내장 객체에 바인딩
	application.setAttribute("email", "coffee@naver.com");
	
	//  주소 정보 추가
	request.setAttribute("address","서울시 강남구");
%>    

<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward</title>
	</head>
	<body>
		<!-- 포워딩 -->
	    <jsp:forward page="member4.jsp"></jsp:forward>
	</body>
</html>

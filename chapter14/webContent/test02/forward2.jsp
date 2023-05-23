<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="sec01.ex01.*"%>
<%
  	request.setCharacterEncoding("utf-8");
	
	// MemberBean 객체 생성하여 회원 정보를 속성에 설정
	MemberBean member = new MemberBean("kong","2222","홍진호","kong2@test.com");
	// 속성이름을 member 로 객체를 바인딩
	request.setAttribute("member", member);
%>    

<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward</title>
	</head>
	<body>
		<!-- 포워딩 -->
	    <jsp:forward page="member2.jsp"></jsp:forward>
	</body>
</html>

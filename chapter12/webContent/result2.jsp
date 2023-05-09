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
	<h1>Login result2</h1>
	<%
		if(id == null || id.length() == 0)
		{	
	%>
		아이디를 입력 하세요.
		<a href="login.html"> 로그인 하기</a>  <!-- 링크 -->

	<%	}else
		{	
			if(id.equals("admin") == true)
			{
	%>
				<h2>관리자님 반갑습니다.</h2>
	<%
			}
			else
			{ 
	%>
				<%= id %>님 환영합니다.
				PW = <%= pw %>
	
	<%			
			}
		}
	%>
</body>
</html>
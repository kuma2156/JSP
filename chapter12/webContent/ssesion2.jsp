<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<%
	//getAttribute() 사용하여 서블릿에 JSP 바인딩
	String name=(String)session.getAttribute("name");
	String address = (String)session.getAttribute("address");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uf-8">
<title>JSP 서블릿</title>
</head>
<body>
	이름은 <%= name %> 입니다 <br>
	주소는 <%= address %> 입니다 <br>
	
</body>
</html>
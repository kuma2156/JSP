<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<%
	//JSP에서는 자동으로 세션 객체를 생성하기에
	// 굳이 getSession() 메서드를 호출하여 session 을 생성 할 필요가 없다
	// 9장 HttpSession session  = request.getSession();
	String name=(String)session.getAttribute("name");
	session.setAttribute("address", "부산시 남구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uf-8">
<title>JSP 서블릿</title>
</head>
<body>
	이름은 <%= name %> 입니다 <br>
	<a href = ssesion2.jsp> 두번째 페이지 이동</a>
</body>
</html>
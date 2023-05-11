<%@ page language="java" contentType="text/html; charset=utf-8"
	
    pageEncoding="EUC-KR"%>
    
 <%
 	// request 객체에 setAttribute() 이용하여 바인딩
 	request.setAttribute("name","쿠마");
 	request.setAttribute("address","우주센터");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>첫 번째 jsp</title>
</head>
<body>
	<%
		// request 객체를 다른 jsp 파일로 포워딩
		RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
		dispatch.forward(request,response);
	%>
</body>
</html>
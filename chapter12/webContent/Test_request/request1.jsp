<%@ page language="java" contentType="text/html; charset=utf-8"
	
    pageEncoding="EUC-KR"%>
    
 <%
 	// request ��ü�� setAttribute() �̿��Ͽ� ���ε�
 	request.setAttribute("name","��");
 	request.setAttribute("address","���ּ���");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ù ��° jsp</title>
</head>
<body>
	<%
		// request ��ü�� �ٸ� jsp ���Ϸ� ������
		RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
		dispatch.forward(request,response);
	%>
</body>
</html>
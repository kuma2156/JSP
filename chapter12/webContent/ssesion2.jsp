<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<%
	//getAttribute() ����Ͽ� ������ JSP ���ε�
	String name=(String)session.getAttribute("name");
	String address = (String)session.getAttribute("address");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uf-8">
<title>JSP ����</title>
</head>
<body>
	�̸��� <%= name %> �Դϴ� <br>
	�ּҴ� <%= address %> �Դϴ� <br>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
    
<%
	// getAttribute()�� ���ε� �� ������
	String name = (String) session.getAttribute("name");
	String address = (String) application.getAttribute("address");
	// apptest1 �� �������Ű �ʰ� apptest2�� �����Ų ��� ���� ���ǰ��� �������� �������� ���ø�ĳ�̼��̸� ���� �����´�
	// 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>�� ��° jsp</title>
</head>
<body>
	<h1> �̸��� <%= name %></h1>
	<h1> �ּҴ� <%= address %></h1>
</body>
</html>
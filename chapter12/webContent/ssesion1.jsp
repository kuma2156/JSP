<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<%
	//JSP������ �ڵ����� ���� ��ü�� �����ϱ⿡
	// ���� getSession() �޼��带 ȣ���Ͽ� session �� ���� �� �ʿ䰡 ����
	// 9�� HttpSession session  = request.getSession();
	String name=(String)session.getAttribute("name");
	session.setAttribute("address", "�λ�� ����");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uf-8">
<title>JSP ����</title>
</head>
<body>
	�̸��� <%= name %> �Դϴ� <br>
	<a href = ssesion2.jsp> �ι�° ������ �̵�</a>
</body>
</html>
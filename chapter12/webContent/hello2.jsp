<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<!-- ���� �ۼ� -->
<%!
	String name = "����";
	public String getName(){
		return name;
	}
%>

<!-- ��ũ��Ʈ�� �ۼ� -->
<%
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>��ũ��Ʈ�� ����</title>
	</head>
	<body>
				   <!-- ǥ�ǽ� -->
		<h1>�ȳ��ϼ���. <%=name %>��!</h1>
		<h2>����� ���̴� <%=age %>���Դϴ�.</h2>
	</body>
</html>
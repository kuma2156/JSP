<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>

<!-- ���� �ۼ� -->
<%!
	String name = "����";
	public String getName(){
		return name;
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>���� ����</title>
	</head>
	<body>
				   <!-- ǥ�ǽ� -->
		<h1>�ȳ��ϼ���. <%=name %>��!</h1>
	</body>
</html>
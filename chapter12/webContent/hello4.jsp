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
	/* ��ũ��Ʈ�� �ּ� ó�� */
	//String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>ǥ���� ����</title>
	</head>
	<body>
				   <!-- ǥ�ǽ� -->
		<h1>�ȳ��ϼ���. <%=name %>��!</h1>
		<!-- <h2>����� ���̴� <%-- <%= age %> --%>���Դϴ�.</h2>  -->
		<h1>����� Ű�� <%= 173 %>cm �Դϴ�</h1>
		<h1>���� + 10�� <%-- <%= Integer.parseInt(age) + 10 %> --%></h1>
	</body>
</html>
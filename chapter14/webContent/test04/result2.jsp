<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>���â</title>
</head>
<body>
	<c:if test="${empty param.userID }">
		���̵� �Է��ϼ��� <br>
		<a href="login.jsp">�α��� â</a>
	</c:if>
	
	<c:if test="${not empty param.userID }">
		<c:if test="${empty param.userID == 'admin'}">
				<h1>�����ڴ� ȯ���մϴ�.</h1>
		</c:if>
		<h1> ȯ���մϴ� <c:out value="${param.userID}"/> ��! </h1>>
	</c:if>
</body>
</html>
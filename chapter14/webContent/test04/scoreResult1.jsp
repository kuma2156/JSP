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
<title>학점 결과</title>
</head>
<body>
	<c:set var ="score" value="${param.score }" />
	<h1> 시험점수
		<c:out value="${score }"/>
	</h1><br>
	<c:choose>
	<c:when test="${score >= 0 && score <= 100}">
		<c:choose>
			<c:when test="${score >= 90 && score <= 100 }">
				<h1> A학점입니다.</h1>
			</c:when>
			<c:when test="${score >= 80 && score < 90 }">
				<h1> B학점입니다.</h1>
			</c:when>
			<c:when test="${score >= 70 && score < 80 }">
				<h1> C학점입니다.</h1>
			</c:when>
			<c:when test="${score >= 60 && score < 70 }">
				<h1> D학점입니다.</h1>
			</c:when>
			<c:otherwise>
				<h1> F학점입니다.</h1>
			</c:otherwise>
	</c:choose>
	</c:when>
		<c:otherwise>
			<h1> 점수를 잘못 입력하였습니다. 다시 입력하세요 </h1>
			<a href="scoreTest.jsp">점수 입력창으로</a>
		</c:otherwise>
	</c:choose>
</body>
</html>
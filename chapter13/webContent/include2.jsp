<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="UTF-8">
	  <title>include2.jsp : 라떼</title>
	</head>
	<body>
		반갑군. JSP 쇼핑몰에 온 걸 환영한다.
		<br>
		<jsp:include page="duke_img.jsp">
			<jsp:param value="듀크2" name="name" />
			<jsp:param value="duke2.png" name="imgName" />
		</jsp:include>
		<br>
		쇼핑몰의 마지막 구간에 도착했다, 여행자. 
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
   
   // session에 address 속성이름으로 바인딩
   session.setAttribute("address", "부산시 사상구");
   
   // request가 session 보다 우선순위가 높기 때문에 request로 받은 서울시 강남구가 나온다.
%>   
<html>
	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	<body>
		<table border="1"  align="center" >
		    <tr align="center" bgcolor="#99ccff">
		      <td width="20%"><b>아이디</b></td>
		      <td width="20%"><b>비밀번호</b></td>
		      <td width="20%"><b>이름</b></td>
		      <td width="20%"><b>이메일</b></td>
		      <td width="20%"><b>주소</b></td>
		   </tr>

		<!--  바인딩 된 속성 이름으로 회원 정보출력 -->
		   <tr align=center>
		      <td>${id}</td>
		      <td>${pwd}</td>
		      <td>${name}</td>
		      <td>${email}</td>
		      <td>${address}</td>
		   </tr>
		</table>
	</body>
</html>

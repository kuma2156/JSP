<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");

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
		   </tr>

		<!--  바인딩 된 속성 이름 member 각각의 MemberBean 속성에 접근하여 회원정보 출력-->
		   <tr align=center>
		      <td>${member.id}</td>
		      <td>${member.pwd}</td>
		      <td>${member.name}</td>
		      <td>${member.email}</td>
		   </tr>
		</table>
	</body>
</html>

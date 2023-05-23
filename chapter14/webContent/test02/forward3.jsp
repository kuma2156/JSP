<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,sec01.ex01.*"%>
<%
  	request.setCharacterEncoding("utf-8");
	
	//ArrayList 객체 생성
	List membersList = new ArrayList();
	// memeberBean 객체 생성 후 회원 정보 저장
	MemberBean m1 = new MemberBean("lee","1234","이순신","lee@test.cc");
	MemberBean m2 = new MemberBean("vava","1234","김바바","vava@test.cc");
	
	// ArrayList 에 2명의 정보 저장
	membersList.add(m1);
	membersList.add(m2);
	//request 내장 객체에 ArrayList를 속성 이름 membersList로 바인딩
	request.setAttribute("membersList", membersList);
%>    

<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward</title>
	</head>
	<body>
		<!-- 포워딩 -->
	    <jsp:forward page="member3.jsp"></jsp:forward>
	</body>
</html>

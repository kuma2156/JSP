<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec01.ex01.*"
    pageEncoding="UTF-8"
%>

<%
	// useBean에 속성 값을 설정하기 전에 한글 인코딩 
	request.setCharacterEncoding("utf-8");
%>

<!-- 유즈빈 액션 태그로 유즈빈을 만듬 -->
<jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page" />
<!-- 회원 가입창에서 전송된 동일한 이름의 매개변수에 해당되는 유즈빈 속성에 전송된 값을 설정 -->
<jsp:setProperty name="m" property="id" value='<%= request.getParameter("id") %>' />
<jsp:setProperty name="m" property="pwd" value='<%= request.getParameter("pwd") %>' />
<jsp:setProperty name="m" property="name" value='<%= request.getParameter("name") %>' />
<jsp:setProperty name="m" property="email" value='<%= request.getParameter("email") %>' />


<%
	MemberDAO memberDAO = new MemberDAO();
	memberDAO.addMember(m);
	List membersList = memberDAO.listMembers();
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 목록창</title>
	</head>
	
	<body>
		<table align="center" width="100%">
		 	<tr align="center" bgcolor="#99ccff"> 
				<td width="7%">아이디</td>
			    <td width="7%">비밀번호</td>
			    <td width="5%">이름</td>
			    <td width="11%">이메일</td>
			    <td width="5%">가입일</td>
			</tr>
		<%	
			if (membersList.size() == 0) {
		%>
			<tr>
				<td colspan="5">
				<p align="center">
					<b>
						등록된 회원이 없습니다.
					</b>
				</p>
			</tr>		   
		<%		
			} else {
				// for 반복문을 이용해 membersList에 저장된 MemberBean 객체를 한 개씩 
				// 가져온 후 각 속성의 회원 정보를 다시 getter를 이용해 출력
				for (int i = 0; i < membersList.size(); i++) {
					MemberBean bean = (MemberBean) membersList.get(i);
		%>
					<tr align="center">
						<td><%= bean.getId() %></td>
						<td><%= bean.getPwd() %></td>
						<td><%= bean.getName() %></td>
						<td><%= bean.getEmail() %></td>
						<td><%= bean.getJoinDate() %></td>
					</tr>
		<%
				} // end for
			} // end if 
		%>
			<tr height="1" bgcolor="#99ccff">
				<td colspan="5"></td>
			</tr>
		</table>
	</body>
</html>
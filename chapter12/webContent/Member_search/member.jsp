<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"
%>

<%
   request.setCharacterEncoding("utf-8");
   String _name = request.getParameter("name"); // 'name' 파라미터의 값을 가져옴
   MemberVO memberVO = new MemberVO(); // MemberVO 객체 생성
   memberVO.setName(_name); // MemberVO 객체에 이름 설정
   MemberDAO dao=new MemberDAO(); // MemberDAO 객체 생성
   List membersList=dao.listMembers(memberVO); // 회원 정보를 가져와서 List에 저장
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보 출력창</title>
		
		<style>
			h1 {
				text-align: center;
			}
			table {
				width: 80%;
				border:1px solid black;
				border-collapse:collapse;
				margin-left: auto;
				margin-right: auto;
				border-spacing: 0px;
			}
			td, th {
				border:1px solid gray;
				padding:10px;
				vertical-align: top;
				text-align: center;
			}
			thead, th {
				background:#eee;
			}
		</style>
	</head>
	
	<body>
		<h1>회원 정보 출력</h1>		
		 <table border='1' width='800' align='center'>
		 <thead>
		 	<tr> 
			     <th>아이디</th>
			     <th>비밀번호</th>
			     <th>이름</th>
			     <th>이메일</th>
			     <th>가입일자</th>
			</tr>
		</thead>
		<%	
			for (int i = 0; i < membersList.size(); i++) {
				MemberVO vo = (MemberVO)membersList.get(i); // List에서 MemberVO 객체를 가져옴
				String id = vo.getId(); // 아이디를 가져옴
				String pwd = vo.getPwd(); // 비밀번호를 가져옴
				String name = vo.getName(); // 이름을 가져옴
				String email = vo.getEmail(); // 이메일을 가져옴
				Date joinDate = vo.getJoinDate(); // 가입일자를 가져옴
		%>
				<tr>
					<td><%= id %></td>
					<td><%= pwd %></td>
					<td><%= name %></td>
					<td><%= email %></td>
					<td><%= joinDate %></td>
				</tr>		   
		<%		
			}
		%>	
		</table>
	</body>
</html>

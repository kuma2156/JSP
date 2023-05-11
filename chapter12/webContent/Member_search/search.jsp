<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
	  <meta charset="UTF-8">
	  <title>회원 검색창</title>
	  
	  <style type="text/css">
	  	input {
			padding: 6px 12px; /* 입력 필드에 대한 패딩 값 설정 */
			border-radius: 6px; /* 입력 필드에 대한 테두리 반경 설정 */
			color: #495057; /* 입력 필드 텍스트 색상 설정 */
			border: 2px solid #ced4da; /* 입력 필드 테두리 설정 */
			font-family: inherit; /* 폰트 패밀리 상속 설정 */
			font-size: inherit; /* 폰트 크기 상속 설정 */
			line-height: inherit; /* 줄 간격 상속 설정 */
		}
	  </style>
	</head>
	<body>
	   <form method="post" action="member.jsp">
		   <!-- 회원 이름 입력 필드 -->
		   이름 : <input type="text" name="name">
		   <!-- 조회하기 버튼 -->
		   <input type ="submit" value="조회하기">
	   </form>
	</body>
</html>

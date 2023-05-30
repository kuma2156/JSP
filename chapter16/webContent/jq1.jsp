<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<!--  제이쿼리를 사용하기 위해 반드시 설정해야함 -->
	<script src="http://code.jquery.com/jquery-2.2.1.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){ // document에 DOM이 로드되는 이벤트 처리함수
			alert($("#jq1").html()); // 페이지 로드시 id가 jq1인 태그르 찾아
		}); 						 // html() 메소드를 사용해 출력
		
		function addHtml(){
			$("#article").html('안녕하세요' + '<br>');
		}
		
		function addImage(){
			$(".jq1").html("<img src='image/duke.png'>");
		} // 버튼  클릭시 클래스 이름을 찾아 <img> 태그 추가
		
		function fn_process(){
			// 아이디로 텍스트 박스에 접근하여 val()메서드를 이용하여 입력 값을 가져옴
			var value = $("#t_input").val();
			// 아이디로 텍스트 박스에 접근하여 val() 메서드를 이용하여 입력 값을 출력
			$("#t_output").val(value);
		}
	</script>
</head>
<body>
	<div>
		안녕하세요
	</div>
	<div id ="jq1">제이쿼리입니다.</div>
	<div id ="jq2">
		<p>제이쿼리 쉽습니다</p>
	</div>
	
	<hr>
	
	<div>
		<p id="article"></p>
	</div>
	<input type="button" value="추가하기" onClick="addHtml()">
	<br>
	<br>
	<div class = "jq1"></div>
	<input type = "button" value = "이미지 추가" onClick="addImage()"><br>
	
	<input type = "text" id = "t_input"/>
	<input type = "button" value = "입력하기" onClick="fn_process()"/> <br><br>
	
	<div>
		결과 : <br>
			<input type = "text" id = "t_output" disabled/>
	</div>
</body>
</html>
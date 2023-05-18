package sec03.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 한글 전송 시 이노딩 작업 생략 Fitter로 처리
		//request.setCharacterEncoding("utf-8");
		//reponse.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// getParameter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
		String user_name = request.getParameter("user_name");
		String user_pw = request.getParameter("user_pw");
		
		// hidden 태그로 전송 된 값을 가져온다.
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		// 결과 출력(브라우저로 결과 출력)
		String data = "하이 나의 친구 <br>" + user_name + "님 환영해 <br><br>";
		data += "<html><body>";
		data += "이름 : " + user_name + "<br>";
		data += "비밀번호 : " + user_pw + "<br>";
		data += "주소 : " + user_address + "<br>";
		data += "email : " + user_email + "<br>";
		data += "휴대전화 : " + user_hp ;
		data += "</html></body>";
		
		out.print(data);
	}

}

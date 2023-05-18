package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login2")
public class Logintest extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 한글 전송 시 이노딩 작업 생략 Fitter로 처리
		//request.setCharacterEncoding("utf-8");
		//reponse.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		// getParameter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		// hidden 태그로 전송 된 값을 가져온다.
//		String user_address = request.getParameter("user_address");
//		String user_email = request.getParameter("user_email");
//		String user_hp = request.getParameter("user_hp");
		
		// 이벤트 핸들러를 생헝한 후 세션에 저장.
		LoginImpl loginUser = new LoginImpl(user_id,user_pw);
		if(session.isNew()) {
			//세션에 바인딩시 미리 HttpSessionBindingListener 를 구현한다.
			// LoginImpl의 valueBound() 메서드 호출
			session.setAttribute("LoginUser", loginUser);
		}
		
		// 결과 출력(브라우저로 결과 출력)	
		out.println("<html><head>");
		out.println("<script type='text/javascript'>");
		// 자바스크립트의 setTimeout() 함수로 5초마다 세블릿에 재용청하여 접속자 수 표시
		out.println("setTimeout('history.go(0);',5000)");
		out.println("</script>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("아이디 : " + loginUser.user_id + "<br>");
		out.println("총 접속자 수 : " + LoginImpl.total_user + "<br>");
		out.println("</body></html>");
	}

}

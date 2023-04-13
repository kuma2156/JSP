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
@WebServlet("/login4")
public class LoginServlet extends HttpServlet 
{
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// getParameter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		
		// memberVO 객체 생성하고, 속성으로 아이디와 비밀번호를 설정
		memberVO memberVO = new memberVO();
		memberVO.setId(user_id);
		memberVO.setPwd(user_pwd);
		
		// memberDAO 객체를 생성
		memberDAO dao = new memberDAO();
		// memberVO의 isExisted() 메서드를 호출하여 memberVO를 인자로 전달
		boolean result = dao.isExisted(memberVO);
		
		if(result)
		{
			HttpSession session = request.getSession();
			
			// isLogin 속성을 true 로 세선에 저장
			session.setAttribute("isLogon", true);
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pwd);
			
			out.print("<html><body>");
			out.print("안녕하세요 " + user_id + "님! <br>");
			out.print("<a href='show'>회원정보보기</a>");
			out.print("</body></html>");
		}
		else
		{
			out.print("<html><body>회원 아이디가 틀렸습니다");
			out.print("<a href='login4.html'>다시 로그인하기</a>");
			out.print("</body></html>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doHandle(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doHandle(request, response);
	}
}

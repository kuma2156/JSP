package sec01.ex02;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet 
{
	
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("init 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// getParameter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		
		out.print("<html><body>");
		
		if(user_id != null && user_id.length() != 0)
		{
			out.print("이미 로그인 상태입니다 <br><br>");
			out.print("첫 번째 서블릿에서 넘겨준 아이디 : " + user_id + "<br>");
			out.print("첫 번째 서블릿에서 넘겨준 비밀번호 : " + user_pw + "<br>");
			out.print("첫 번째 서블릿에서 넘겨준 주소 : " + user_address + "<br>");
			out.print("이미 로그인 상태입니다 <br><br>");
		}
		else
		{
			out.print("로그인 하지 않았습니다.<br><br>");
			out.print("로그인 해라 임마 <br>");
			out.print("<a href = '/chapter09/login2.html'> 로그인 창으로 이동하기 </>");
		}
	}
	
	public void destroy()
	{
		System.out.println("destroy 메서드 호출");
	}



}

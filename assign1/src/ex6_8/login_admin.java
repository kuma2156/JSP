package ex6_8;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login_admin")

public class login_admin extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init 메소드 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("doPost 메소드 호출");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		
		// 아이디 값이 비워있지 않고 아이디의 길이가 0이 아닐 경우 실행
		if(id != null && (id.length() != 0))
		{
			// id가 admin일 경우 
			if(id.equals("admin"))
			{
				out.print("<html>");
				out.print("<body>");
				
				out.print("<font size = '12'> 관리자로 로그인 하셨습니다.</font>");
				out.print("<br>");
				out.print("<input type = button value = '회원정보 수정하기' />");
				out.print("<input type = button value = '회원정보 삭제하기' />");
				
				out.print("</body>");
				out.print("</html>");
			}
			else
			{
				out.print("<html>");
				out.print("<body>");
				
				out.print(id + "님이 로그인 하셨습니다.");
				out.print("<br>");
				
				out.print("</body>");
				out.print("</html>");
			}	
		}
		else
		{
			out.print("<html>");
			out.print("<body>");
			
			out.print("아이디를 입력하셔야합니다.");
			out.print("<br>");
			out.print("<a href='http://localhost:8090/assign1/login.html'> 로그인 창으로 이동 </a>");
			
			out.print("</body>");
			out.print("</html>");
		}
	} 

	public void destroy() 
	{
		System.out.println("destroy 메소드 호출");
	}
}

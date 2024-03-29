package sec04.ex01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet4
 */
@WebServlet("/Login4")
public class LoginServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메소드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드 호출");
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드 호출");
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 폰트설정
		System.out.println("doHandle 메소드 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
				
		PrintWriter out = response.getWriter();
				
		// id pw 가져오기
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
				
		String data = "<html>";
		data += "<body>";
				
		data += "아이디 : " + user_id;
		data += "<br>";
		data += "비밀번호 : " + user_pw;
				
		data += "</body>";
		data += "</html>";
				
		out.print(data);
	}
}

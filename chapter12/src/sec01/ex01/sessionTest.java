package sec01.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class sessionTest
 */
@WebServlet("/sess")
public class sessionTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 세션 가져오기
		HttpSession session = request.getSession();
		// 세션 객체에  name 바인딩
		session.setAttribute("name", "김명규");
		
		out.println("<html><body>");
		out.println("<h1> 세션에 이름을 바인딩 합니다.</h1>");
		out.println("<a href='/chapter12/ssesion1.jsp'> 첫 번째 페이지로 이동하기 </a>");
		out.println("</body></html>");
	}

}

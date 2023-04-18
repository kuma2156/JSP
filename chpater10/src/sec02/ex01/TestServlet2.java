package sec02.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/first/*")
public class TestServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String context = request.getContextPath();// context 이름을 가져옴
		String url = request.getRequestURL().toString(); // 전체 URL 가져옴
		String mapping = request.getServletPath(); // 매핑 이름 가져옴
		String uri = request.getRequestURI(); // uri 가져옴
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>test servlet 2 </title>");
		out.println("</head>");
		out.println("<body bgcolor='yellow'>");
		out.println("<b>test servlet 2 입니다.</b><br>");
		out.println("<b>컨텍스트명 : " + context + "</b><br>");
		out.println("<b>전체경로 : " + url + "</b><br>");
		out.println("<b>매핑명 : " + mapping + "</b><br>");
		out.println("<b>URI : " + uri + "</b>");
		out.println("</body>");
		out.println("</html>");
		
	}

}

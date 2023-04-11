package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/set")
public class SetCookieValue extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date();
		
		// cookie 객체를 생성한 후 cookie Test 이름으로 한글 정보를 인코딩 하여 쿠키에 저장
		Cookie c = new Cookie("CookieTest",URLEncoder.encode("JSP Programming","utf-8"));
		
		// 유효기간 설정 24시간
		c.setMaxAge(24 * 60 * 60);
		
		// 생성된 쿠키를 브라우저로 전송
		response.addCookie(c);

		out.println("현재시간 : " + d);
		out.println("<br> 문자열을 Cookie에 저장합니다.");
	} 

}

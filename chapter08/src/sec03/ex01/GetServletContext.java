package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cget")
public class GetServletContext extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//getServletContext 객체 가져오기
		ServletContext context = getServletContext();
		
		// member 로 이전에 바인딩 된 회원 정보를 가져옴
		List member = (ArrayList)context.getAttribute("member");
		// 배열의 0번에는 이름 1번에는 나이가 적혀있기에 ..
		String name = (String) member.get(0);
		int age = (Integer) member.get(1);

		out.print("<html><body>");
		out.print("이름 :" + name + "<br>");
		out.print("나이 :" + age + "<br>");
		out.print("</body></html>");
		
		
	}

}

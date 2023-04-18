package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/get")
public class GetAttribute extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletContext();
		HttpSession sess = request.getSession();
		
		// getAttribute() 메서드를 이용하여 속성이름으로 바인딩 값을 가져와 출력
		//											id
		String ctxMesg = (String) ctx.getAttribute("Context");
		String sesMesg = (String) sess.getAttribute("Session");
		String reqMesg = (String) request.getAttribute("Request");
		
		out.print("context값 :" + ctxMesg + "<br>");
		out.print("session값 :" + sesMesg + "<br>");
		out.print("request값 :" + reqMesg + "<br>");
	}

}

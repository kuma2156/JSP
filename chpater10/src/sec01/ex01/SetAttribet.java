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


@WebServlet("/set")
public class SetAttribet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ctxMesg = "context에 바인딩 됩니다.";
		String sesMesg = "session에 바인딩 됩니다.";
		String reqMesg = "request에 바인딩 됩니다.";
		
		//getServletContext 객체 , getSession 객체,
		// HttpServletRequest 객체의 setAttribte() 메서드를 이용해 속성 바인딩
		ServletContext ctx = getServletContext();
		HttpSession sess = request.getSession();
		
		//                  id        
		ctx.setAttribute("Context", ctxMesg);
		sess.setAttribute("Session", sesMesg);
		request.setAttribute("Request", reqMesg);
		
		out.print("바인딩을 수행합니다");
	}

}

package sec01.ex05;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 다른 서블릿들은 first로 접속이 아니라 second로 변경되어 접속이 되는데 
 * 디스패치로 포워드하면 ..
 * first5로도 접속이 되고 second5로도 접속이 된다.
 * 
 * name 값을 dding 으로 주고 first5로 접속하면 이름 값이 dding 으로 값이 잘 전달 되었지만.
 * second5로 접속을 하면 name 값을 second5에서는 받지 못하였다.
 */
@WebServlet("/first5")
public class firstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher dispatch = request.getRequestDispatcher("second5?name=dding");
		dispatch.forward(request, response);
	}

}

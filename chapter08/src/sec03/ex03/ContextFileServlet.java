package sec03.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cfile")
public class ContextFileServlet extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//getServletContext 객체 가져오기
		ServletContext context = getServletContext();
		
		//해당 위치의 파일을 읽어 옴
		InputStream is = context.getResourceAsStream("/WEB-INF/bin/init.txt");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
		
		String menu = null;
		String menu_member = null;
		String menu_order = null;
		String menu_goods = null;
		
		// , 를 구분자로 메뉴 항목을 분리 함
		while((menu = buffer.readLine()) != null)
		{
			StringTokenizer tokens = new StringTokenizer(menu,",");
			menu_member = tokens.nextToken();
			menu_order = tokens.nextToken();
			menu_goods = tokens.nextToken();
		}
		
		out.print("<html><body>");
		out.print(menu_member + "<br>");
		out.print(menu_order + "<br>");
		out.print(menu_goods + "<br>");
		out.print("</body></html>");
		
		out.close();
	}

}

package sec01.ex01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class inputServlet
 */
public class inputServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		System.out.println("Third init 메소드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		// TODO Auto-generated method stub
		System.out.println("Third destroy 메소드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		// 값 불러오고 저장하기
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		// 출력
		System.out.println("아이디 : " + user_id);
		System.out.println("비밀번호 : " + user_pw);
		
		// 여러개의 값을 가져올때는 getParameterValues를 선언해야한다. 당연히 여러개이니 배열에 담아야한다.
		 String[] subject = request.getParameterValues("subject");
		 System.out.print("선택한 과목 : ");
		 for(String str : subject)
		 {
			 System.out.print(str + ", ");
		 }
	}


}

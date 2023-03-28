package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/member5")
public class memberServlet extends HttpServlet
{
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		memberDAO dao = new memberDAO();
		
		String command = request.getParameter("command");
		if(command != null && command.equals("addMember"))
		{
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email = request.getParameter("email");
			
			memberVO vo = new memberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			
			dao.addMember(vo);
		}
		else if (command != null && command.equals("delMember"))
		{
			String id = request.getParameter("id");
			dao.delMember(id);
		}
		
		List<memberVO> list = dao.listMembers();
			
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='SkyBlue'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
			
		for(int i = 0; i < list.size(); i++)
		{
			memberVO memberVO = (memberVO) list.get(i);
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
				
			out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>" + email + "</td><td>" + joinDate + "</td><td>"
					+ "<a href='/chapter07/member5?command=delMember&id=" + id + "'>삭제</a></td></tr>");
		}
		out.print("</table></body></html>");
		//추가
		out.print("<a href='/chapter07/memberform.html'>새 회원등록</a>");
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doHandle(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doHandle(request, response);
	}
	

}

package sec04.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class memberDAO 
{
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public memberDAO()
	{
		try 
		{
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<memberVO> listMembers()
	{
		List<memberVO> list = new ArrayList<memberVO>();
		
		try
		{
			con = dataFactory.getConnection();
			String query = "select * from t_member";
			System.out.println(query);
			
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			
			while(rs.next())
			{
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				memberVO vo = new memberVO();
				
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				
				list.add(vo);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}

	
	public void addMember(memberVO memberVO2)
	{
		try
		{
			con = dataFactory.getConnection();
			String id = memberVO2.getId();
			String pwd = memberVO2.getPwd();
			String name = memberVO2.getName();
			String email = memberVO2.getEmail();
			
			String query = "insert into t_member";
			query += "(id,pwd,name,email)";
			query += "values(?,?,?,?)";
			System.out.println("prepareStatment : " + query);
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,pwd);
			pstmt.setString(3,name);
			pstmt.setString(4,email);
			
			pstmt.executeUpdate();
			pstmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delMember(String id)
	{
		try
		{
			con = dataFactory.getConnection();
			
			String query = "delete from t_member" + " where id=?";
			System.out.println("prepareStatment : " + query);
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
			pstmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean isExisted(memberVO memberVO)
	{
		boolean result = false;
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		
		System.out.println(pwd);
		try
		{
			con = dataFactory.getConnection();
			
			// decode() 함수를 이용하여 SQL문으로 회원 정보를 조회
			// 아이디와 비밀번호가 테이블에 있으면 true를 반호나하고, 없으면 false를 반환하라
			String query = "select decode(count(*),1,'true','false') as result from t_member";
			query += " where id=? and pwd=?";
			System.out.println(query);
			
			// 메서드로 전달된 아이디와 비밀번호를 이용하여 SQL문을 작성한 후 데이터베이스에서 부르기
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,pwd);
			ResultSet rs = pstmt.executeQuery();
			rs.next(); // 커서를 첫번째 레코드로 위치시킴
			
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result = " +result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
}

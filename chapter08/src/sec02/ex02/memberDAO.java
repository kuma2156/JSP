package sec02.ex02;

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
	

}

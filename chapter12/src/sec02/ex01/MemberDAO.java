package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con; // 데이터베이스 연결을 위한 Connection 객체
	private PreparedStatement pstmt; // SQL 문을 실행하기 위한 PreparedStatement 객체
	private DataSource dataFactory; // 데이터베이스 연결 풀을 위한 DataSource 객체

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원 정보 조회 메서드
	public List listMembers(MemberVO memberVO) {
		List<MemberVO> membersList = new ArrayList(); // 회원 정보를 저장할 List
		String _name = memberVO.getName(); // 입력된 이름 정보 가져오기
		try {
			con = dataFactory.getConnection(); // Connection 객체 가져오기
			
			String query = "select * from t_member"; // SQL 문장 작성
			
			if ((_name != null && _name.length() != 0)) { // 이름 정보가 입력되었을 경우
				query += " where name=?"; // 추가적인 조건으로 이름 검색
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, _name);
			} else {
				pstmt = con.prepareStatement(query);
			}
			
			System.out.println("prepareStatement : " + query); // 실행될 SQL 문장 출력
			ResultSet rs = pstmt.executeQuery(); // SQL 문장 실행 결과를 ResultSet으로 받아오기
			while (rs.next()) { // ResultSet에서 데이터를 가져와 MemberVO 객체에 저장
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				membersList.add(vo); // MemberVO 객체를 List에 추가
			}
			rs.close(); // ResultSet, PreparedStatement, Connection 객체 반환
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return membersList; // 조회된 회원 정보 List 반환
	}

}

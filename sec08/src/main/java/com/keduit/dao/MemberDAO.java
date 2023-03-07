package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.keduit.dto.MemberVO;



public class MemberDAO {
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection connection = null;
		Context initContext = new InitialContext();
		Context envContext=(Context)initContext.lookup("java://comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/TestDB");
		connection=ds.getConnection();
		return connection;
	}

	//사용자 인증시 처리하는 메소드
	public int userCheck(String id,String pwd) {
		int result=-1;
		String sql="select pwd from member where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try {
			connection=getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,id);
			
			resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				if(resultSet.getString("pwd") !=null&&resultSet.getString("pwd").equals(pwd)) {
					return 1;
				}else {return 0;}
			}
				
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(resultSet !=null) {resultSet.close();}
				if(preparedStatement!=null) {preparedStatement.close();}
				if(connection !=null) {connection.close();}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		
		return result;
	}

	
	// 아이디로 회원정보를 가져오는 메서드
	public MemberVO getMember(String id) {
		MemberVO mVO = null;
		String sql = "select * from member where userid=?"; //id를 sql에서 찾아와야함
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				mVO=new MemberVO();
				mVO.setName(rs.getString("name"));
				mVO.setid(rs.getString("userid"));
				mVO.setPwd(rs.getString("pwd"));
				mVO.setEmail(rs.getString("email"));
				mVO.setPhone(rs.getString("phone"));
				mVO.setAdmin(rs.getInt("admin"));
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) {
					rs.close();
				}
				if(pstmt !=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: 
			}
		}
		// TODO Auto-generated method stub
		return mVO;
	}

	public int updateMember(MemberVO mVO) {
		int result = -1;
		String sql = "update member set pwd=?,email=?, phone=?, admin=? where userid=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mVO.getPwd());
			pstmt.setString(2, mVO.getEmail());
			pstmt.setString(3, mVO.getPhone());
			pstmt.setInt(4, mVO.getAdmin());
			pstmt.setString(5, mVO.getid());
			result = pstmt.executeUpdate(); //int 값으로 주기떄문에
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(pstmt !=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: 
			}
		//TODO Auto-generated method stub
	}
		return result;
	}

	public int confirmID(String id) {
		int result = -1;
		String sql ="select userid from member where userid=?";
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultset=null;
		try {
		connection=getConnection();
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, id);
		resultset = preparedStatement.executeQuery();
		if(resultset.next()) {
			result=1;
		}else {
			result=-1;
		}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(resultset !=null) {resultset.close();}
				if(preparedStatement !=null) {preparedStatement.close();}
				if(connection !=null) {connection.close();}
				
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		return result;
	}
	public int insertMember(MemberVO mVO) {
		int result=0;
		String sql = "insert into member values(?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mVO.getName());
			pstmt.setString(1, mVO.getid());
			pstmt.setString(1, mVO.getPwd());
			pstmt.setString(1, mVO.getEmail());
			pstmt.setString(1, mVO.getPhone());
			pstmt.setInt(1, mVO.getAdmin());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			try {
				if(pstmt !=null) {pstmt.close();}
				if(conn  !=null) {conn.close();}
				
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		return result;
	}
}

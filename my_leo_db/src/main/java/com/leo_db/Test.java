//package com.leo_db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Test {
//
//	private Connection con =null; // 연결
//	private PreparedStatement pstt=null; // 
//	// mysql 링크
//	private final String url = "jdbc:mysql://localhost:3306/public_data?serverTimezone=UTC";
//
//	private final String id ="root"; // mysql 아이디
//	private final String pw ="0000"; // mysql 비번
//	private static Test d; // d를 받아온다.
//	
//	//???
//	private dataDAO() { 
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // 잘모르겠음
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	//???
//	public void getCon() {
//		try {
//			con=DriverManager.getConnection(url, id, pw);
//			System.out.println();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	//??
//	public void disCon() {
//		try {
//			if(pstt !=null) {
//				pstt.close();
//			}
//			if(con !=null) {
//				con.close();
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	// ???
//	public static dataDAO newInst() {
//		if(d==null) {
//			d=new dataDAO();
//		}
//		return d;
//	}
//	
//	public void datainst(dataVO v) {
//		try {
//			//1. DB연결
//			getCon();
//			
//			//2 sql문 작성
//			String sql = "insert into my_data values(null,?,?,?,?,?,?,?)";
//			
//			//3. mysql로 sql문을 전달
//			pstt =con.prepareStatement(sql);
//			
//			//4. preparestatement에서 v로 전달받을 값
//			pstt.setString(1, v.getTitle());
//			pstt.setString(2, v.getExplanation());
//			pstt.setString(3, v.getReviews());
//			pstt.setString(4, v.getPhone());
////			pstt.setString(5, v.getAtmosphere());
////			pstt.setString(6, v.getMusic_genre());
////			pstt.setString(7, v.getMusical_instrument());
//			pstt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//

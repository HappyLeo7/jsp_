package com.leo_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MydbDAO {
	
    // 연결 필드선언
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;

	// mysql링크
//	private final String url="jdbc:mysql:localhost:3306/public_data?serverTimezone=UTC";
	
	
	private final String ID="root"; // mysql 아이디
	private final String PW="0000"; // mysql 비번
	private static MydbDAO dd ; //dd를 받아온다
	
	//sql연결
	private MydbDAO() {
		try {
			// Class의 클래스를 사용하여 forName("드라이버경로")를 사용하여 sql과 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
	}
	public void getconnt() {
		Master_Massard master_Massard =new Master_Massard();
		try {
			connection=DriverManager.getConnection(master_Massard.setUrl("jdbc:mysql:localhost:3306/public_data?serverTimezone=UTC"), ID, PW);
			System.out.println("[---mysql connect---]");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

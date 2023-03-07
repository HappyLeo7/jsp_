package com.utill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
//서버를 통해서 SQL하고 연결
	public static Connection getConnection() {
		Connection connection=null;
		
		try {
			Context initialContext= new InitialContext();
			Context envContext= (Context) initialContext.lookup("java:/comp/env");
			DataSource dataSource =(DataSource) envContext.lookup("jdbc/TestDB");
			connection = dataSource.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void close(Connection conn,Statement stmt,ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void close(Connection conn,Statement stmt) {
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}

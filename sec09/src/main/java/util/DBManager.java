package util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	public static Connection getConnection() {
		// 커넥션 : 연결 // import
		Connection connection = null;

		try {
			Context initialContext = new InitialContext();
			// 형변필요
			Context envContext = (Context) initialContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/TestDB");
			connection = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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

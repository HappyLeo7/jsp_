package com.leoCompany.dataAccessObjest;
//데이터 베이스의 접근(Access(액세스))하기 위한 객체
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDataAccessObjest {
	//private하여 외부에서 매서드를 사용할수 없게 은닉해준다.
	private MemberDataAccessObjest() {
		
	}
	//내부에서 생성자MemberDataAccessObjest()를 생성하고 instance에 넣어준다. 
	//static을 사용하여 어디서든 값이 동일하게 저장되게 해준다? 
	private static MemberDataAccessObjest instance=new MemberDataAccessObjest();
	// getInstance() 매서드로 instance 안에 있는 new를 넣어두고 다른곳에서 getInstance()를 계속 불러올때마다 생성할수 있게만들어줌
	public static MemberDataAccessObjest getInstance() {
		return instance;
	}
	
	//서버를 통해서 MYSQL연결해보기
	//Connection은 import가 필요하다.
	//import java.sql.Connection;
	public Connection getConnection() throws Exception{ //throws 오류가 생길때 상위로 보내버린다.
		//커넥션타입의 커넥션은 null을 받는다.
		Connection connection= null;
		//initialContext:초기 컨텍스트
		//import javax.naming.Context;
		//import javax.naming.InitialContext;
		Context initialContext =new InitialContext();
		//envContext : 끝? 컨텍스트
		Context envContext=(Context)initialContext.lookup("java://comp/env");
		//import javax.sql.DataSource;
		DataSource dataSource = (DataSource)envContext.lookup("jdbc/LeoCompanyDB");
		connection=dataSource.getConnection();
		
		return connection;
		//Servers 파일에서 MYSQL 드라이버를 불러오고 ID와PWD를 적을수 있는경로를 체크해야한다.
	}

	public int userCheck(String id, String password) {
		int result=-1;
		//사용자의 아이디와 비밀번호를 체크해보자
		//체크하려면 MYSQL 데이터를 가져와야한다.
		
		//연결 / 준비된 진술서 / 결과집합에 null을 넣어서 초기화해줌
		//연결, 커넥션, Connection
		Connection connection=null;
		//프리페어드 스테잇먼트 PreparedStatement
		PreparedStatement preparedStatement=null;
		//리설트 셋, Resultset;
		ResultSet resultset=null;
		//불러오고 싶은 ID의 비밀번호 데이터를 SQL문으로 불러오자
		String sql="select pwd from member where userid=?";
		
		try {
			//서버를 통해 MYSQL을 연결해둔 매서드를 가져와서 사용해보자
			connection=getConnection();
			//sql에 사용할 문장을 sql에 넣어서 가져온다.
			preparedStatement=connection.prepareStatement(sql);
			System.out.println(preparedStatement);
			//setString을 사용하여 입력한 ID를 받아온다.
			preparedStatement.setString(1, id);
			System.out.println(preparedStatement);
			//결과값 모아오기? executeQuery()는 select한 결과문을 받아온다.
			resultset=preparedStatement.executeQuery();
//			System.out.println(resultset);
			if(resultset.next()) {
				System.out.println("pwd : "+resultset.getString("pwd"));
				System.out.println("password : "+password);
				if(resultset.getString("pwd") !=null&&resultset.getString("pwd").equals(password)) {
				
				return 1;}
			else {return 0;}}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
				try {
					if(resultset !=null) {
					resultset.close();}
					if(resultset !=null) {
						resultset.close();
					}
					if(resultset !=null) {
						resultset.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		return result;
	}
	
	
	
}

package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.keduit.vo.EmployeesVO;
import com.utill.DBManager;

public class EmployeesDAO {
//내부은닉  // 외부에서 사용할수 있게 만들어준다.
	//디폴트 생성자
	private EmployeesDAO(){
		
	}
	private static EmployeesDAO instanec =new EmployeesDAO();
	public static EmployeesDAO getInstanec() {
		return instanec;
	}
	
//데이터를 불러와야하고 employeesList.jsp리스트에 넣어서 뿌려준다.
	public List<EmployeesVO> selectAllFromEmployees(){
		//sql에 입력할 명령문
		String sql = "select * from employees order by id desc"; // order by는 오름차순
		
		//받아온 자료를 list 변수에 넣기
		List<EmployeesVO> list=new ArrayList<EmployeesVO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		EmployeesVO eVO=null;
		
		try {
		conn= DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
			while(rs.next()) {
				eVO=new EmployeesVO();
				eVO.setId(rs.getString("id"));
				eVO.setPass(rs.getString("pass"));
				eVO.setName(rs.getString("name"));
				eVO.setLev(rs.getString("lev"));
				eVO.setEnter(rs.getString("enter"));
				eVO.setGender(rs.getString("gender"));				
				eVO.setPhone(rs.getString("phone"));
				
				list.add(eVO);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
		
	}
}


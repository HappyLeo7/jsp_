package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.keduit.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
 //외부에서 생성자를 만들수 없게 private하고
	private ProductDAO() {
	 
 }
	//내부에서 생성자를 만든다.
 private static ProductDAO instance=new ProductDAO();
 //외부에서 부를수 있는 매서드를 만들고 위에것을 열어줄것을 만든다.
 public static ProductDAO getInstance() {
	 return instance;
 }
 
 public List<ProductVO> selectAllProducts(){
	 String sql="select * from product order by code desc";
	 List<ProductVO> list=new ArrayList<>();
	 Connection connection = null;
	 PreparedStatement preparedStatement =null;
	 ResultSet resultSet=null;
	 try {
		connection =DBManager.getConnection();
		preparedStatement = connection.prepareStatement(sql);
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			ProductVO productVO=new ProductVO();
			productVO.setCode(resultSet.getInt("code"));
			productVO.setName(resultSet.getString("name"));
			productVO.setDescription(resultSet.getString("description"));
			productVO.setPictureurl(resultSet.getString("pictureurl"));
			productVO.setPrice(resultSet.getInt("price"));
			list.add(productVO);
		}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	} finally {
		DBManager.close(connection, preparedStatement, resultSet);
	}
	 return list;
 }
 public void insertProduct(ProductVO pVO) {
	 String sql= "insert into product values(null,?,?,?,?)";
	 Connection conn=null;
	 PreparedStatement pstmt=null;
	 try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, pVO.getName());
		pstmt.setInt(2, pVO.getPrice());
		pstmt.setString(3, pVO.getPictureurl());
		pstmt.setString(4, pVO.getDescription());
		//인설트라 업데이트 시켜주어야함
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
		DBManager.close(conn, pstmt);
	}
 }
 //code로 상품 하나 읽어오기
 public ProductVO selectProductByCode(String code) {
	 ProductVO pVO=null;
	 String sql="select *from product where code = ?";
	try {
		Connection conn =null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		
		try {
			//DB연결
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,code);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				//DB저장
				pVO=new ProductVO();
				pVO.setCode(rs.getInt("code"));
				pVO.setDescription(rs.getString("description"));
				pVO.setName(rs.getString("name"));
				pVO.setPictureurl(rs.getString("pictureurl"));
				pVO.setPrice(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBManager.close(conn, pstmt,rs);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	 return pVO;
 }
 //업데이트
 public void updateProduct(ProductVO pVO) {
	 String spl="update product set name=?,price=?,pictureurl=?,description=? where code=?";
	 Connection conn=null;
	 PreparedStatement pstmt =null;
	 try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(spl);
		pstmt.setString(1, pVO.getName());
		pstmt.setInt(2, pVO.getPrice());
		pstmt.setString(3, pVO.getPictureurl());
		pstmt.setString(4, pVO.getDescription());
		pstmt.setInt(5, pVO.getCode());
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
		DBManager.close(conn, pstmt);
	}
 }
 
 //상품삭제
 public void deleteProduct(String code) {
	 String sql="delete from porduct where code=?";
	 Connection conn = null;
	 PreparedStatement pstmt=null;
	 try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, code);
		pstmt.executeQuery();
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
		DBManager.close(conn, pstmt);
	}
 }
/////////////////////////////////////////////////////////////////////////////
}

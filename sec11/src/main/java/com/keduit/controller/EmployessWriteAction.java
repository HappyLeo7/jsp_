package com.keduit.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.vo.EmployeesVO;

public class EmployessWriteAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//등록된 데이터를 VO에 저장하자
		EmployeesVO eVO=new EmployeesVO(); //eVO생성자
		eVO.setId(request.getParameter("id"));
		eVO.setPass(request.getParameter("pass"));
		eVO.setName(request.getParameter("name"));
		eVO.setLev(request.getParameter("lev"));
		eVO.setEnter((request.getParameter("enter")));
//		private String id;
//		private String pass;
//		private String name;
//		private String lev;
//		private Timestamp enter;
//		private String gender;
//		private String phone;
		
	}

}

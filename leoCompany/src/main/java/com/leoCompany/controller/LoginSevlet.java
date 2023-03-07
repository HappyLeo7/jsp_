package com.leoCompany.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leoCompany.dataAccessObjest.MemberDataAccessObjest;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet("/login.do")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher은 import가 필요하다 위치는 javax.servlet.RequestDispatcher;
		// request : 요청하다 , 부탁하다
		// .getRequestDispatcher("보내고자하는 주소");
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/login.jsp"); //가고자하는 로그인페이지 경로 입력 
		// dispatcher로 받은 링크의 주소를 불러온다.
		dispatcher.forward(request, response);
		//받아온 주소로 연결
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//기본 경로 설정
		String url="member/login.jsp";
//		String url= "index.jsp";
		//받아올 데이터는 ID와 PWD를 받아오고 그것을 이용해서 데이터를 비교한후 해당되는 데이터를 가져와야한다.
		//login페이지에서 보낸 id 받아오기
		String id=request.getParameter("id");
		//login페이지에서 보낸 password 받아오기
		String password=request.getParameter("password");
		
		//아이디 비밀번호 받아오기 mysql에서
//		 MemberDataAccessObjest memberDataAccessObjest=MemberDataAccessObjest.getInstance();
		 int result=MemberDataAccessObjest.getInstance().userCheck(id,password);
		 
		 if(result==1) {
			 
			 request.setAttribute("message", id+"님 로그인 성공");
			 System.out.println(id);
			 url="loginPage.jsp";
		 }else if(result==0) {
			 request.setAttribute("message", "비밀번호가 틀렸습니다. : ");
			 System.out.println(result);
		 }else if(result==-1) {
			 request.setAttribute("message", "회원가입해주세요. : ");
			 System.out.println(result);
		 }
		 
		 
		 RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		 dispatcher.forward(request, response);
		 
		
		doGet(request, response);
	}

}

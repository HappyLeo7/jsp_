package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.MemberDAO;
import com.keduit.dto.MemberVO;

/**
 * Servlet implementation class MemberUpdate
 */
@WebServlet("/MemberUpdate.do")
public class MemberUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		MemberDAO mDAO = MemberDAO.getInstance();
		MemberVO mVO = mDAO.getMember(id);
		request.setAttribute("mVO", mVO);
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/02_memberUpdate.jsp");
		dispatcher.forward(request, response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //한글패치
		// 폼의 내용 받기
//		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String admin=request.getParameter("admin");
		
		MemberVO mVO = new MemberVO();
		mVO.setid(id);
		mVO.setPwd(pwd);
		mVO.setEmail(email);
		mVO.setPhone(phone);
		mVO.setAdmin(Integer.valueOf(admin));
		
		MemberDAO mDAO=MemberDAO.getInstance();
		int result =mDAO.updateMember(mVO);
		if(result>0) {
		
		response.sendRedirect("02_login.do");
		}
//		doGet(request, response);
	}

}

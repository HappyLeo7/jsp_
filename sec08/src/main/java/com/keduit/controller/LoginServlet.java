package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.keduit.dao.MemberDAO;
import com.keduit.dto.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/02_login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 *
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("member/02_login.jsp"); // 링크연결방법
		dispatcher.forward(request, response);

		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "member/02_login.jsp";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		MemberDAO mDAO = MemberDAO.getInstance();
		int result = mDAO.userCheck(id, pwd);

		if (result == 1) {
			System.out.println(id);
			MemberVO mVO= mDAO.getMember(id);
			HttpSession session=request.getSession(); //session 에 담자
			session.setAttribute("loginUser", mVO); // 검색후 공부 필요
			request.setAttribute("message", "회원 가입 성공!");
			
//			request.setAttribute("message", "로그인성공");
			//메인페이지로 보내야함
			url = "02_main.jsp";
		} else if (result == 0) {
			request.setAttribute("message", "비밀번호가 틀렸습니다. 다시입력하세요");
		} else if (result == -1) {
			request.setAttribute("message", "가입되지 않은 회원 입니다.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

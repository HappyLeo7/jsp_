package com.keduit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	MemberBean memberBean = new MemberBean();
//	response.setContentType("text/html;charset=UTF-8");
	request.setCharacterEncoding("UTF-8");
//	memberBean.setName(request.getParameter("name"));
//	memberBean.setUserid(request.getParameter("userid"));
//	memberBean.setNickname(request.getParameter("nickname"));
//	memberBean.setPwd(request.getParameter("pwd"));
//	memberBean.setEmail(request.getParameter("email"));
//	memberBean.setPhone(request.getParameter("phone"));
	request.setAttribute("memberBean", memberBean);
	RequestDispatcher requestDispatcher =request.getRequestDispatcher("09_el.jsp");
	requestDispatcher.forward(request, response);
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		MemberBean memberBean = new MemberBean();
//		memberBean.setName(request.getParameter("name"));
//		memberBean.setUserid(request.getParameter("userid"));
//		memberBean.setNickname(request.getParameter("nickname"));
//		memberBean.setPwd(request.getParameter("pwd"));
//		memberBean.setEmail(request.getParameter("email"));
//		memberBean.setPhone(request.getParameter("phone"));
//		RequestDispatcher requestDispatcher =request.getRequestDispatcher("09_el.jsp");
//		requestDispatcher.forward(request, response);
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

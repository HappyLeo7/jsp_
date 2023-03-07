package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age")); // request.getParameter("age") 은 무조건 String으로 받아오기때문에
																	// 숫자로 바꿔줘야한다.
		PrintWriter ou = response.getWriter();
		ou.print("<html><head></head><body>");
		ou.print("<h3>당신이 입력한 GET자료입니다.</h3>");
		ou.print("아이디 : " + id + "<br>");
		ou.print("나이 : " + age);
		ou.print("<br><a href='javascript:history.go(-1)'>다시입력</a>"); // 다시가기버튼
		ou.print("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		String id1 = request.getParameter("id1");
		int age1 = Integer.parseInt(request.getParameter("age1"));
		PrintWriter ou = response.getWriter();
		ou.print("<html><head></head><body>");
		ou.print("<h3>당신이 입력한 POST자료입니다.</h3>");
		ou.print("아이디 : " + id1 + "<br>");
		ou.print("나이 : " + age1);
		ou.print("<br><a href='javascript:history.go(-1)'>다시입력</a>"); // 다시가기버튼
		ou.print("</body></html>");

	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//doGet(request,response);
//		
//	}

}

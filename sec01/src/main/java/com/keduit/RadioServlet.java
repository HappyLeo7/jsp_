package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RadioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//한글패치
		response.setContentType("text/html;charset=UTF-8");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		PrintWriter oo = response.getWriter();
		oo.print("<html><body>");
		oo.print("<h4>성별 : "+gender+"</h4>");		
		oo.print("<h4>메일수신여부 : "+chk_mail+"</h4>");
		oo.print("가입인사 : "+content);
		oo.print("<a href='javascript:history.go(-1)'>뒤로가기</a>");
		oo.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

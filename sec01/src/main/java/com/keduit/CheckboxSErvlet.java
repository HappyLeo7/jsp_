package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckboxSErvlet")
public class CheckboxSErvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter ot = response.getWriter();
		String items[] = request.getParameterValues("item");
		ot.print("<html>");
		ot.print("<body>");
		if(items==null) {
			ot.print("선택한 항목이 없습니다.");
		}else  {
			ot.print("<h3>선택한 항목</h3>");
			ot.print("<hr>");
		for(String item : items) {
			ot.print(item+"<br>");
			
			
		}}
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		ot.print("<h3>당신이 선택한 직업 </h3>");
		ot.print(job);
		ot.print("<hr>");
		if(interests==null) {
			ot.print("아무것도 선택하지않았습니다");
		}else {
			ot.print("<h3>당신이 선택한 취미 </h3>");
			for(String interest : interests) {
			ot.print(interest+"<br>");
		}
		}
		ot.print("<br><a href='javascript:history.go(-1)'>다시선택</a>"); // 다시가기버튼
		ot.print("</body>");
		ot.print("</html>");
		
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter ot = response.getWriter();
	String items[] = request.getParameterValues("item");
	ot.print("<html>");
	ot.print("<body>");
	ot.print("<h3>선택한 항목</h3>");
	ot.print("<hr>");
	for(String item : items) {
		ot.print(item+"<br>");
		
	}
	ot.print("<br><a href='javascript:history.go(-1)'>다시선택</a>"); // 다시가기버튼
	ot.print("</body>");
	ot.print("</html>");
	}

}

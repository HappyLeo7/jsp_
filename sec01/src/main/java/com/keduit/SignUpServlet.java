package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// getParameter(" ? ")   물음표에 들어가는 값은 jsp에서 id가 아닌 name 으로 지정한 값을 찾는다.
		String name=request.getParameter("name");
		int unique_number=Integer.parseInt(request.getParameter("unique_number"));
		int unique_number1=Integer.parseInt(request.getParameter("unique_number1"));
		int password=Integer.parseInt(request.getParameter("password"));
		String id=request.getParameter("id");
		String email=request.getParameter("email");
		String email1=request.getParameter("email1");
		int zip_code=Integer.parseInt(request.getParameter("zip_code"));
		String address=request.getParameter("address");
		String address1=request.getParameter("address1");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int phone1=Integer.parseInt(request.getParameter("phone1"));
		int phone2=Integer.parseInt(request.getParameter("phone2"));
		String job=request.getParameter("job");
		String interestings[]=request.getParameterValues("interesting");
		String sms=request.getParameter("sms");
		out.print("<html>");
		out.print("<body>");
		out.print("<p>");
		out.print("이름 : ");
		out.print(name);
		out.print("<br>");
		out.print("주민번호 : ");
		out.print(unique_number);
		out.print("-");
		out.print(unique_number1);
		out.print("<br>");
		out.print("아 이 디 : ");
		out.print(id);
		out.print("<br>");
		out.print("비밀번호 : ");
		out.print(password);
		out.print("<br>");
		out.print("이 메 일 :");
		out.print(email);
		out.print("@");
		out.print(email1);
		out.print("<br>");
		out.print("우편번호 : ");
		out.print(zip_code);
		out.print("<br>");
		out.print("주 소 : ");
		out.print(address);
		out.print(address1);
		out.print("<br>");
		out.print("핸드폰번호 : ");
		out.print(phone);
		out.print("-");
		out.print(phone1);
		out.print("-");
		out.print(phone2);
		out.print("<br>");
		out.print("직업 : ");
		out.print(job);
		out.print("<br>");
		out.print("SMS 수신여부 : ");
		out.print(sms);
		out.print("<br>");
		out.print("관심분야 : ");
		for(String interesting : interestings) {
			
			out.print(interesting+", ");
		}
		out.print("<br><a href='javascript:history.go(-1)'>이전 화면</a>");
//		out.print();
		
		out.print("</p>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

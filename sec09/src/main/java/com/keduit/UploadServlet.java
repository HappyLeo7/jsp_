package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글패치
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String savePath = "upload";
		// 최대 업로드 파일 크기 5MB
		int uploadFileSizelimit = 5*1024*1024; // 5메가 = 5*1024*1014
		
		String encType="UTF-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath=context.getRealPath(savePath);
		System.out.println("서버상의 실제 디렉토리 : ");
		System.out.println(uploadFilePath);
		
		try {
		
			  MultipartRequest multi = new MultipartRequest(
		               request,
		               uploadFilePath,
		               uploadFileSizelimit,
		               encType,
		               new DefaultFileRenamePolicy()); 
			
			//파일 업로드시 숫자가 추가됨
			//업로드된 파일의 이름을 가져옴.
			String fileName = multi.getFilesystemName("uploadFile");
			if(fileName==null) {
				System.out.println("파일이 업로드 되지 않았음.");
			}else {
				out.println("<br> 글쓴이 : " + multi.getParameter("name"));
				out.println("<br> 제 목 : " + multi.getParameter("title"));
				out.println("<br> 파일명 : " + fileName);
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	}


//package com.keduit;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.oreilly.servlet.MultipartRequest;
//import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
//
///**
// * Servlet implementation class UploadServlet
// */
//@WebServlet("/upload.do")
//public class UploadServlet extends HttpServlet {
//   private static final long serialVersionUID = 1L;
//
//   /**
//    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//    */
//   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      request.setCharacterEncoding("UTF-8");
//      response.setContentType("text/html; charset=UTF-8");
//      PrintWriter out = response.getWriter();
//      
//      String savePath = "upload";
//
//      int uploadFileSizeLimit = 5 * 1024 * 1024; //최대 업로드 파일 크기(5MB로 줌) 
//      
//      String encType="UTF-8";
//      
//      ServletContext context = getServletContext();
//      String uploadFilePath = context.getRealPath(savePath);
//      System.out.println("서버상의 실제 디렉토리");
//      System.out.println(uploadFilePath);
//      
//      try {
//         MultipartRequest multi = new MultipartRequest(
//               request, 
//               uploadFilePath,
//               uploadFileSizeLimit,
//               encType,
//               new DefaultFileRenamePolicy()); //new DefaultFileRenamePolicy() : 중복파일은 리네임해 업로드
//
//         // 업로드된 파일의 이름을 가져옴.
//         String fileName = multi.getFilesystemName("uploadFile");
//         if (fileName == null) {
//            System.out.println("파일이 업로드 되지 않았음");
//         } else {
//            out.println("<br> 글쓴이 : " + multi.getParameter("name"));
//            out.println("<br> 제  목 : " + multi.getParameter("title"));
//            out.println("<br> 파일명 : " + fileName);
////            System.out.println("<br> 글쓴이 : " + multi.getParameter("name")); 
//            //sysout은 콘손창에 띄우는것, 웹화면에 띄우려면 html방식으로 해야함(?)
//         }
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
//}

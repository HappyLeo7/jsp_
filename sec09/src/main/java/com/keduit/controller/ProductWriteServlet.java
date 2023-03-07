package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.ProductDAO;
import com.keduit.dto.ProductVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class ProductWriteServlet
 */
@WebServlet("/productWrite.do")
public class ProductWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//경로받아오기
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/productWrite.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext context=getServletContext();
		String path =context.getRealPath("upload");
		String encType="UTF-8";
		int sizeLimit=20*1024*1024;
		
		MultipartRequest multipartRequest=new MultipartRequest(request, path,sizeLimit,encType,new DefaultFileRenamePolicy());
		String name= multipartRequest.getParameter("name");
		int price=Integer.parseInt(multipartRequest.getParameter("price"));
		String description = multipartRequest.getParameter("description");
		String pictureurl= multipartRequest.getFilesystemName("pictureurl");
		
		//DAO에게 보내주려고 받아옴
		ProductVO pVO=new ProductVO();
		pVO.setDescription(description);
		pVO.setName(name);
		pVO.setPictureurl(pictureurl);
		pVO.setPrice(price);
		
		ProductDAO pDAO=ProductDAO.getInstance();
		pDAO.insertProduct(pVO);
		response.sendRedirect("poductList.do");
				
	}

}

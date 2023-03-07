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
 * Servlet implementation class ProductUpdateServlet
 */
@WebServlet("/productUpdate.do")
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//수정할 상품을 get으로 받아오고
		// 수정할 화면 켜줘야한다.
		String code=request.getParameter("code");
		ProductDAO pDAO=ProductDAO.getInstance();
		ProductVO pVO=pDAO.selectProductByCode(code); //상품하나 받아오기
		
		request.setAttribute("product", pVO);
		//경로 입력
		RequestDispatcher requsetDispatcher = request.getRequestDispatcher("product/productUpdate.jsp");
		//경로 연결
		requsetDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ServletContext context=getServletContext();
		String path=context.getRealPath("upload");
		String encTpye="UTF-8";
		int sizelimit=20*1024*1024;
		
		MultipartRequest mr=new MultipartRequest(request, 
				path,
				sizelimit,
				encTpye,
				new DefaultFileRenamePolicy() //정책
				);
		String code=mr.getParameter("code");
		String name=mr.getParameter("name");
		int price=Integer.parseInt(mr.getParameter("price"));
		String pictureurl=mr.getFilesystemName("pictureurl");
		String description=mr.getParameter("description");
		
		if(pictureurl==null) {
			pictureurl=mr.getParameter("nonmakeImg");
		}
		
		ProductVO pVO=new ProductVO();
		pVO.setCode(Integer.parseInt(code));
		pVO.setName(name);
		pVO.setPrice(price);
		pVO.setPictureurl(pictureurl);
		pVO.setDescription(description);
		
		ProductDAO pDAO = ProductDAO.getInstance();
		pDAO.updateProduct(pVO);
		
		response.sendRedirect("productList.do");
		
	}
//////////////////
}

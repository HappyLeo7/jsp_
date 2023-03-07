package com.keduit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.ProductDAO;
import com.keduit.dto.ProductVO;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/productList.do")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//외부로 불러오기때문에 내부에서 지정한 매서드를 가져온다
		ProductDAO productDAO=ProductDAO.getInstance();
		
		List<ProductVO> productList = productDAO.selectAllProducts();
		request.setAttribute("productList", productList);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("product/productList.jsp");
		requestDispatcher.forward(request, response);
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

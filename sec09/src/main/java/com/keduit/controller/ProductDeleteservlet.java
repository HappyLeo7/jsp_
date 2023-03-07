package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.ProductDAO;
import com.keduit.dto.ProductVO;

/**
 * Servlet implementation class ProductDeleteservlet
 */
@WebServlet("/productDelete.do")
public class ProductDeleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDeleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String code = request.getParameter("code");
ProductDAO pDAO=ProductDAO.getInstance();
ProductVO pVO=pDAO.selectProductByCode(code);
request.setAttribute("product", pVO);
RequestDispatcher requestDispatcher=request.getRequestDispatcher("product/productDelete.jsp");
requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code=request.getParameter("code");
		ProductDAO pDAO=ProductDAO.getInstance();
		pDAO.deleteProduct(code);
		response.sendRedirect("productList.do");
	
	}

}

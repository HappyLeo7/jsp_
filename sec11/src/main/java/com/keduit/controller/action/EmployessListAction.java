package com.keduit.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeesDAO;
import com.keduit.vo.EmployeesVO;

public class EmployessListAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/employees/employeesList.jsp";
		EmployeesDAO eDAO=EmployeesDAO.getInstanec();
		List<EmployeesVO> employeesList = eDAO.selectAllFromEmployees();
		System.out.println("EmployessListAction.java (employeesList) : "+employeesList);
		request.setAttribute("employeesList", employeesList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}

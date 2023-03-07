package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.dao.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		System.out.println("num : "+num);
		BoardDAO bDAO=BoardDAO.getInstance();
		bDAO.deleteBoard(num);
		new BoardListAction().excute(request, response);
	}

}

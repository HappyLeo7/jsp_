package com.leoCompany.controller;

import com.leoCompany.controller.action.Action;

public class ActionFactory {
	
	//1. 내부 생성자 만들기
	private static ActionFactory instance =new ActionFactory();
	
	//2. 기본 생성자
	private ActionFactory() {
		super();
	}
	public static ActionFactory getNew() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action=null;
		System.out.println("ActionFactory : "+command);
		
		//command value가 들어왔을때 비교하여서 필요로한 매서드 매칭
		if(command.equals("login_Page")) {
			action=new LoginPageAction();
		}
		
		return action;
	}
}

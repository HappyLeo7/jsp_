package com.keduit.controller;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.EmployessListAction;

public class ActionFactory {
private static ActionFactory instance=new ActionFactory();
private ActionFactory() {
	super();
}
//static
public static ActionFactory getInstance() {
	return instance;
}
public Action getAction(String command) {
	Action action=null;
	System.out.println("ActionFactory (command): "+command);
	
	if(command.equals("employess_list")) {
		action=new EmployessListAction();
	}if(command.equals("employees_write_form")) {
		action=new EmployessWriteFormAction();
	}if(command.equals("employees_write")) {
		action=new EmployessWriteAction();
	}
	
	return action;
}

}

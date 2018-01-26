package com.ek.strutsdemo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ek.strutsdemo.struts.form.LoginForm;

public class LoginAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		LoginForm loginForm = (LoginForm)form;
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if("homer".equals(username)&&"123".equalsIgnoreCase(password)){
			return mapping.findForward("success");
		}
		
//		DynaActionForm  dynaform = (DynaActionForm)form;
//		String username =dynaform.getString("username");
	
		
		return mapping.getInputForward();
	}
	
	
	
	
	

}
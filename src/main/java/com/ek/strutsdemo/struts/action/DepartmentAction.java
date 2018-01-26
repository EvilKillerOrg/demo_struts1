package com.ek.strutsdemo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.ResponseUtils;

import com.ek.strutsdemo.struts.form.LoginForm;


//多方法时 1.增加配置属性: parameter="method"
//				 2.继承DispatchAction
public class DepartmentAction extends DispatchAction {

	public ActionForward addDepartment(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return null;
	}
	
	
	public ActionForward editDepartment(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return null;
	}
	
	public ActionForward listDepartment(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println(ResponseUtils.filter("<hr>")); //打印的是&lt;hr&gt; 说明这个过滤器可以过滤 尖括号< >
		
		
		LoginForm loginForm1 =new LoginForm();
		loginForm1.setUsername("hehe");
		LoginForm loginForm2 =new LoginForm();
		
		BeanUtils.copyProperties(loginForm2, loginForm1);  // 从orig原始的 拷贝到 dest目标中
		
		System.out.println(loginForm2.getUsername());
		return null;
	}

	
	
	//默认的方法 没传递method的时候指定调用其他的方法
	@Override
	protected ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 
		return listDepartment(mapping, form, request, response);
	}
	
	
	

}
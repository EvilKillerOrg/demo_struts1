package com.ek.strutsdemo.struts.plugin;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class MyPlugIn implements PlugIn{

	private String testMessage;
	
	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}

	
	@Override
	public void destroy() {
		System.out.println("destroy>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
		System.out.println("init>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+testMessage);
	}

}

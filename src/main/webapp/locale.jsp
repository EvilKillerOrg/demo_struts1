<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@  page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Locale locale = Locale.getDefault();
		out.print(locale+"  这个是虚拟机的locale");
		out.print("<br>");
		
		Locale locale2 = request.getLocale();
		out.print(locale2+"  request中的locale 这个改变了浏览器的语言 这里就变了, 也就是说用这种方法可以获得浏览器设置的文字以实现国际化");
	%>
</body>
</html>
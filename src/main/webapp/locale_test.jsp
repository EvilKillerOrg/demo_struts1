<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic"  prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested"  prefix="nested"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<bean:message key="aaa"/><br><br>
	<bean:message key="show.message.username"/><br><br>
	<bean:message key="show.message.username" bundle="display"/><br><br><br>
	国际化的步骤:<br>
	1.添加不同语言的资源文件<br>
	2.设置成UTF-8字符集<br>
	3.bean:message key取值
</body>
</html>
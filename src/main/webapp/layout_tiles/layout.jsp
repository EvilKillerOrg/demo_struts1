<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic"  prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested"  prefix="nested"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles"  prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" height="100%" border="1" align="center">
		<tr>
			<td colspan="2">&nbsp;
				<tiles:insert attribute="top" /> <!-- attribute 逻辑名 在资源文件中关联具体的页面-->
			</td>
		</tr>
		<tr>
			<td width="30%">&nbsp;
				<tiles:insert attribute="left" />
			</td>
			<td width="70%">&nbsp;
				<tiles:insert attribute="main" />
			</td>
		</tr>
	</table>
</body>
</html>
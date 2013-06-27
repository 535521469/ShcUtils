<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check Fetch</title>
</head>
<body>

	<%-- 	<s:form name="ShowMessage" method="post" action="/hello/ShowMessage.action" > --%>
	<s:form name="ShowMessage" method="post" action="ShowMessage"
		namespace="/hello">
		<s:textfield name="name" key="user" />
		<s:textfield name="password" key="pass" />
		<s:submit key="login" />
	</s:form>

</body>
</html>
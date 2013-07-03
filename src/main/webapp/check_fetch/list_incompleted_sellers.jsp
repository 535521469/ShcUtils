<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>补充未抓完整的数据</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>name</td>
			<td>phone</td>
			<td>address</td>
			<td>操作</td>
		</tr>
		<s:iterator value="sellers">
			<tr>
				<td><s:property value="seqID" /></td>
				<td><s:property value="shopName" /></td>
				<td><s:property value="shopPhone" /></td>
				<td><s:property value="shopAddress" /></td>
				<td><s:a target="_blank" action="getIncompletedSeller">
						<s:param name="seqID" value="seqID" />原址</s:a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
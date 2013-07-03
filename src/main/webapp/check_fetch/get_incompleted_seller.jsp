<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0"> 
<title>补充未抓完整的数据</title>
</head>
<body>
	<s:form action="saveIncompletedSeller" namespace="/cf">
		<s:textfield name="newSeller.seqID" value="%{seller.seqID}"
			label="商户ID" />
		<s:textfield name="newSeller.shopName" value="%{seller.shopName}"
			label="商户名称" />
		<s:textfield name="newSeller.shopPhone" value="%{seller.shopPhone}"
			label="商户电话" />
		<s:textfield name="newSeller.shopAddress"
			value="%{seller.shopAddress}" label="商户地址" />
		<s:hidden name="newSeller.shopUrl" value="%{seller.shopUrl}" />
		<s:submit label="保存" />
	</s:form>
	<iframe src='<s:property value="%{seller.shopUrl}"/>' width="100%"
		height="500px"></iframe>

</body>
</html>
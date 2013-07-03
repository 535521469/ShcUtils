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
<title>补录的数据</title>
</head>
<body>
	<s:form namespace="/cf">
		<s:textfield name="newSeller.seqID" value="%{seller.seqID}"
			readonly="true" label="商户ID" />
		<s:textfield name="newSeller.shopName" value="%{seller.shopName}"
			readonly="true" label="商户名称" />
		<s:textfield name="newSeller.shopPhone" value="%{seller.shopPhone}"
			readonly="true" label="商户电话" />
		<s:textfield name="newSeller.shopAddress" readonly="true"
			value="%{seller.shopAddress}" label="商户地址" />
	</s:form>
</body>
</html>
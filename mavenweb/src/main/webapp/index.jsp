<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Maven测试页面</title>
</head>
<body>
<h1>Hello Maven</h1>
<table border="1px">
	<tr>
		<td>uuid</td>
		<td>name</td>
		<td>tele</td>
	</tr>
	<c:forEach var="i" items="${ list }">
	<tr>
		<td>${ i.uuid }</td>
		<td>${ i.name }</td>
		<td>${ i.tele }</td>
	</tr>
	</c:forEach>
</table>



</body>
</html>
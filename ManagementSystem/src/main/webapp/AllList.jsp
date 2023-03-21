<%@page import="java.util.List"%>
<%@page import="com.model.Engineer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<% List<Engineer>  e=(List<Engineer>) request.getAttribute("li"); %>

<%
for(Engineer enr:e){
%>
<%= enr.getEname() %>

<%} %>

<h1>this is list</h1>
	
<h1>hello</h1>	
</body>
</html>
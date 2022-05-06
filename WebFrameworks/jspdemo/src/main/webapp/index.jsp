<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directive in JSP</title>

</head>
<body>
<h1><%=new java.util.Date()%></h1>

<%!int a=3,b=4;  %>
<%
int result=a+b;
out.println("Result:"+result);

%>
<% 
String name=request.getParameter("username");
out.print("Welcome:"+name);
session.setAttribute("user",name);
%>

<a href="second.jsp">Second JSP Page</a>
<%@ include file="index.html" %>
<%
//response.sendRedirect("http://www.google.com");
%>

</body>
</html>
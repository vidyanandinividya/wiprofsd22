<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//String uname=(String)session.getAttribute("user");
//out.print("Hello"+uname);
%>
<%@ page errorPage="exception.jsp" %>
<%
int num1=10;
int num2=0;
out.print("Result"+(num1/num2));


%>
</body>
</html>
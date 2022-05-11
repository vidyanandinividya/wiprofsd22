<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Third JSP Page</h2>
<%=request.getParameter("name") %>
<jsp:useBean id="obj" class="sample.Calculator"></jsp:useBean>
<%
int result=obj.add(10, 20);
out.print("Result:"+result);
%>
</body>
</html>
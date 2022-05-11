<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>This is Index JSP Page</h2>
<jsp:include page="second.jsp"></jsp:include>
<h2>end of jsp index page </h2>
<jsp:forward page="third.jsp">
<jsp:param value="Hello World" name="name"/>
</jsp:forward>
</body>
</html>
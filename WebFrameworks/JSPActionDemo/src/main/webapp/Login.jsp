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
Cookie name=new Cookie("uname",request.getParameter("uname"));
Cookie email=new Cookie("uemail",request.getParameter("uemail"));
response.addCookie(name);
response.addCookie(email);
%>
<h1>User Name:</h1>
<%=request.getParameter("uname") %>
<h1>Email:</h1>
<%=request.getParameter("uemail") %>

<h1>Read Cookie</h1>
<%
Cookie cookie=null;
Cookie [] cookies=null;
cookies=request.getCookies();
if(cookies!=null)
{
for(int i=0;i<cookies.length;i++)
{
	cookie=cookies[i];
	out.print("Name:"+cookie.getName());
	out.print("Value:"+cookie.getValue());
	
	
}

}
else
{
out.print("<h2>No cookies found</h2>");	
}
%>
</body>
</html>
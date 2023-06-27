<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User,servlet.Login" %>
<%
//User u = (User) session.getAttribute("user");
User userId = (User) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h1>homepage</h1>
<h2><%= userId.getUserId()%></h2>
<p><%= userId.getUserId()%></p>
</body>
</html>
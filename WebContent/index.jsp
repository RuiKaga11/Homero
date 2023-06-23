<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <!-- スコープの内容(今回はセッション)はここで拾う。データベースのアカウント情報とここでの入力内容を照合する -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインページ</title>
</head>
<body>
<form action="/Homero/Login" method="post">
<h1><%//userid,%><% //userpass%></h1>
<input type="text" name="name">
<input type="password" name="pass">
<input type="submit" value="ログイン">
</form>
<form action="/Homero/Login" method="get">
<input type="submit" value="アカウント登録">
</form>
</body>
</html>
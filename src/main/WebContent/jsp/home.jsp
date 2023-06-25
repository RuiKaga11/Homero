<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import model.Mutter %>
<%
// リストの取得
List<Mutter> mutterList = (List<Mutter>) request.getAttribute("mutterList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ほめろ</title>
</head>
<body>
<!-- ヘッダ -->
<div id=header>
<h1><a href="/Homero/home?sort=null">ほめろ</a></h1>
<div id=logout><a href="/Homero/logout">ログアウト</a></div>
</div>
<!-- メニュー(左カラム) -->
<ul>
<li><a href="/Homero/home?sort=null">HOME</a>
<li><a href="設定ページURL">ユーザーページ</a>
<li><a href="/Homero/Fome">投稿する</a>
</ul>
<!-- カテゴリーソート(右カラム) -->
<p>カテゴリーソート
<a href="/Hemero/home?sort=1">スポーツ</a>
<a href="/Hemero/home?sort=2">勉強</a>
<a href="/Hemero/home?sort=3">仕事</a>
<a href="/Hemero/home?sort=4">家事</a>
<a href="/Hemero/home?sort=99">その他</a>
<!-- 投稿リスト表示 -->
<div id=baner>
<p>
HOME
<a href="/Homero/home">更新</a>
</p>
</div>
<% int ranNum = (int)(Math.randam()*3)+1 %>
<% for(int i = 0; i < mutterList.size(); i += ranNum) { %>
	<p>
	<!-- カテゴリ表示 -->
	<%= mutterList[i].getCatgory %>を
	<!-- 時間表示 -->
	<% if(mutterList[i].getHour != 0) { %>
		<%= mutterList[i].getHour %>時間
	<% } %>
	<% if(mutterList[i].getMinute != 0) { %>
		<%= mutterList[i].getMinute %>分
	<% } %>
	頑張った！
	</p>
<% } %>
<a href="#header">ページTOPへ</a>
</body>
</html>
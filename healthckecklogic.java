<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Human"%>
    <%
    //リクエストスコープに保存されたHealthインスタンスを取得
    Human health = (Human)request.getAttribute("health");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>BMI健康診断</title>
</head>
<body>
<h1>BMI健康診断の結果</h1>
<p>

身長: <%=health.getHeight() %>(cm)<br>
体重: <%=health.getWeight() %>(kg)<br>
BMI: <%=health.getBmi() %><br>
体型: <%=health.getBodyType() %>
</p>
<a href ="/example/HealthCheck">戻る</a>
</body>
</html>

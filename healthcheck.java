<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>BMI診断</title>
</head>
<body>
<h1>BMI健康診断</h1>
<form action="/example/HealthCheck" method="post">
名前：<input type="text" name="name"><br> 
		男<input 	type="radio" name="gender" value="0">
		 女<input type="radio" name="gender" value="1"> <br>
身長:<input type ="text" name="height">(cm)<br>
体重: <input type ="text" name = "weight">(kg)<br>
年齢:<select 　name="age">
			<option value="teens">10代</option>
			<option value="youngers">20代</option>
			<option value="adults">30代-60代</option>
			<option value="olders">70代</option>
		</select><br>

<input type ="submit" value ="診断">
</form>
</body>
</html>

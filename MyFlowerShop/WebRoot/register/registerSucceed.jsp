<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册成功</title>
</head>
<body>
	<center>
		<h4>恭喜你<font color="#ff0000" size="4">${name}</font>注册成功!</h4><br>
		<h4>三秒后将自动跳转到登录首页....</h4>
	</center>
	<%response.setHeader("Refresh", "3;URL=../index.jsp");%>
</body>
</html>
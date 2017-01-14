<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Войти</title>
</head>
<body>
	<h1>Добро пожаловать!</h1> 
	<c:if test="${not empty error}">
		<p style="color: red">${error}</p>
	</c:if>
	<form action="login" method="post">
		Введите логин: <input type="text" name="login"><br>
		Введите пароль: <input type="password" name="pass"><br>
		<input type="submit" value="Войти"/>
	</form>
</body>
</html>
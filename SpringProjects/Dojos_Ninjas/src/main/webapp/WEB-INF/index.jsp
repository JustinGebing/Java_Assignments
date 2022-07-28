<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo and Ninjas</title>
</head>
<body>
    <div>
    <c:forEach var="dojo" items="${dojos}">
        <p><a href="/dojos/${dojo.id}"> <c:out value="${team.name}"></c:out></a></p>
    </c:forEach>
</div>
<hr>
<div>
    <p> <a href="/dojos/new"> Create New Dojo</a></p>
    <p> <a href="/ninjas/new"> Create New Ninja</a></p>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> <c:out value="${dojo.name}"></c:out> </title>
</head>
<body>
<h1><c:out value="${dojo.name}"></c:out></h1>
<div>
    <c:forEach var="player" items="${dojo.ninjas}">
        <p> <c:out value="${ninja.first_name}"></c:out> <c:out value="ninja.last_name"></c:out></p>
        <p>Age: <c:out value="ninja.age"></c:out></p>
        <br>
    </c:forEach>
</div>
<hr>
<div>
    <p><a href="/ninja/new">New Ninja</a></p>
</div>
</body>
</html>
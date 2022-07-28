<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos</title>
</head>
<body>
	<div>
    <form:form action="/dojos/new" method="post" modelAttribute="dojo">
        <form:label path="name">Dojo Location:</form:label>
        <form:input type="text" path="name"></form:input>
        <input type="submit" value="Create Dojo">
    </form:form>
</div>
</body>
</html>
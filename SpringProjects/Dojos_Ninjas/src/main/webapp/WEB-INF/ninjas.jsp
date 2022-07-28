<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja:</title>
</head>
<body>
<div>
    <form:form>
        <form:label path="first_name">First name:</form:label>
        <form:input type="text" path="first_name"></form:input>
        <form:label path="last_name">Last name:</form:label>
        <form:input type="text" path="last_name"></form:input>
        <form:label path="age">Age:</form:label>
        <form:input type="number" path="age"></form:input>
        <form:label path="dojo">Dojo:</form:label>
        <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos}">
                <option value="${dojo.id}">${dojo.name}</option>
            </c:forEach>
        </form:select>
        <input type="submit" value="Add Ninja">
    </form:form>
</div>
</body>
</html>
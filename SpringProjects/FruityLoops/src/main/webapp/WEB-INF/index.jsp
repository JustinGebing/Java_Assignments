<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Fruits</title>
</head>
<body>
    <h1>Fruit Store</h1>
       <table class="table">
       <tr>
       		<td>Name:</td>
       		<td>Price:</td>
       	</tr>
    	<c:forEach var="fruit" items="${fruits}">
       		<tr>
       			<td>${fruit.name}</td>
       			<td>${fruit.price}</td>
       		</tr>
       	</c:forEach>
       </table>
</body>
</html>

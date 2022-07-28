<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Expense Report</title>
</head>
<body>
<a href="/travels"> <Button>Home</Button> </a>
<table>
	    <thead>
	        <tr>
	        	<th>Expense</th>
	        	<th>Vendor</th>
	        	<th>Amount</th>
	        	<th>Description</th>
	        	<th>Actions</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	        	<td> <c:out value="${travel.expense}"></c:out> </td>
	        	<td> <c:out value="${travel.vendor}"></c:out> </td>
	        	<td> <c:out value="${travel.amount}"></c:out> </td>
	        	<td> <c:out value="${travel.description}"></c:out> </td>
	        	<td> <a href="/update/${travel.id}"><button>Update</button></a> <a href="/delete/${travel.id}"><button>Delete</button></a> </td>
	        </tr>
	    </tbody>
    </table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense Report</title>
</head>
<body>
	<a href="/travels"> <Button>Home</Button> </a>
	 <form action="/update/${travel.id}" method="post">
	 <input type="hidden" name="_method" value="put">
	 
	        <div>   
	            <label for="expense">What did you buy?</label>
	            <input type="text" name="expense" value="${travel.expense}">
	        </div>
	        <div>
	            <label for="vendor">Who did you buy it from?</label>
	            <input type="text" name="vendor" value="${travel.vendor}">
	        </div>
	        <div>
	            <label for="amount">How much was it?</label>
	            <input type="number" name="amount" value="${travel.amount}">
	        </div>
	        <div>
	            <label for="desciprtion">Describe it:</label>
	            <input type="text" name="description" value="${travel.description}">
	        </div>
			<input type="submit">
			<input type="reset">
	    </form>
</body>
</html>
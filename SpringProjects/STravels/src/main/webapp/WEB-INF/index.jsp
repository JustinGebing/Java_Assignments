<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input new Travel Expense Report</title>
</head>
<body>
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
	        <c:forEach items="${travels}" var="travel">
	        <tr>
	        	<td> <c:out value="${travel.expense}"></c:out> </td>
	        	<td> <c:out value="${travel.vendor}"></c:out> </td>
	        	<td> <c:out value="${travel.amount}"></c:out> </td>
	        	<td> <c:out value="${travel.description}"></c:out> </td>
	        	<td> <a href="/update/${travel.id}"><button>Update</button></a> <a href="/delete/${travel.id}"><button>Delete</button></a> <a href="/view/${travel.id}"><button>View</button></a></td>
	        </tr>
	        </c:forEach>
	    </tbody>
    </table>


    <form action="/create"  method="post">
        <div>   
            <label for="expense">What did you buy?</label>
            <input type="text" name="expense">
        </div>
        <div>
            <label for="vendor">Who did you buy it from?</label>
            <input type="text" name="vendor">
        </div>
        <div>
            <label for="amount">How much was it?</label>
            <input type="number" name="amount">
        </div>
        <div>
            <label for="desciprtion">Describe it:</label>
            <input type="text" name="description">
        </div>
        
        <input type="submit">
        <input type="reset"> 
        
    </form>

</body>
</html>
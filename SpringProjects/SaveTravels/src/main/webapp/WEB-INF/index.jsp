<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
        <tr>Expense</tr>
        <td></td>
        <tr>Vendor</tr>
        <td></td>
        <tr>Amount</tr>
        <td></td>
        <tr>Actions</tr>
        <td></td>
    </table>


    <form action="/create">
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
        
    </form>

</body>
</html>
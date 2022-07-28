<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense Report</title>
</head>
<body>
 <form action="/update">
        <div>   
            <label for="expense">What did you buy?</label>
            <input type="text" name="expense" value="${expense.expense}">
        </div>
        <div>
            <label for="vendor">Who did you buy it from?</label>
            <input type="text" name="${vendor.vendor}">
        </div>
        <div>
            <label for="amount">How much was it?</label>
            <input type="number" name="${amount.amount}">
        </div>
        <div>
            <label for="desciprtion">Describe it:</label>
            <input type="text" name="${description.description}">
        </div>
    </form>
</body>
</html>
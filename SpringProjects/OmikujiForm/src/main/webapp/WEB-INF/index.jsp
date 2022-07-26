<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Omikuji Form</title>
</head>
<body>
    <h3>Send an Omikuji!</h3>
    <form action="/omikuji/show" method="GET">
		<div>
			<label for="num">Pick any number from 5 to 25</label>
			<input type="number" id="num" name="num" min="5" max="25">
		</div>
		<div>
			<label for="city">Enter the name of any city:</label>
			<input type="text" name="city">
		</div>
		<div>
			<label for="person">Enter the name of any person:</label>
			<input type="text" name="person">
		</div>
		<div>
			<label for="prof">Enter professional endeavor of hobby:</label>
			<input type="text" name="prof">
		</div>
		<div>
			<label for="thing">Enter any type of living thing:</label>
			<input type="text" name="thing">
		</div>
		<div>
			<label for="nice"> Say something nice to someone:</label>
			<input type="text" name="nice">
		</div>
		<input type="submit">
		<input type="reset">
    </form>
</body>
</html>
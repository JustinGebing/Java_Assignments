<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Omikuji</title>
</head>
<body>
    <p> In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> 
    as your room mate, <c:out value="${prof}"/> for a living. The next time you see a <c:out value="${thing}"/>, you will have good luck. Also, <c:out value="${nice}"/></p>
</body>
</html>
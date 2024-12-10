<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scholarship Management System</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>

<header>
    <nav>
        <a href="/home">Home</a>
        <a href="/login">Login</a>
        <a href="/register">Register</a>
        <c:if test="${not empty sessionScope.user}">
            <a href="/user-dashboard">User Dashboard</a>
            <a href="/admin-dashboard">Admin Dashboard</a>
            <a href="/logout">Logout</a>
        </c:if>
    </nav>
</header>

<main>

</main>

</body>
</html>

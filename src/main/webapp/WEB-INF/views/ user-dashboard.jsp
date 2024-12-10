<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
</head>
<body>

<%@ include file="header.jsp" %>
<h2>User Dashboard</h2>
<h3>Scholarships Available</h3>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="scholarship" items="${scholarships}">
            <tr>
                <td>${scholarship.title}</td>
                <td>${scholarship.description}</td>
                <td>${scholarship.amount}</td>
                <td>
                    <a href="/apply-scholarship/${scholarship.id}">Apply</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@ include file="footer.jsp" %>

</body>
</html>

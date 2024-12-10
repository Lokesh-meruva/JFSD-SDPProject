<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scholarship Details</title>
</head>
<body>

<%@ include file="header.jsp" %>
<h2>Scholarship Details</h2>
<table>
    <tr>
        <th>Title</th>
        <td>${scholarship.title}</td>
    </tr>
    <tr>
        <th>Description</th>
        <td>${scholarship.description}</td>
    </tr>
    <tr>
        <th>Amount</th>
        <td>${scholarship.amount}</td>
    </tr>
    <tr>
        <th>Deadline</th>
        <td>${scholarship.deadline}</td>
    </tr>
</table>
<%@ include file="footer.jsp" %>

</body>
</html>

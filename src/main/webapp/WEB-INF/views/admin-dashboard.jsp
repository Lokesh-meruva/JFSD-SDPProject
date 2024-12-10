<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%@ include file="header.jsp" %>
<h2>Admin Dashboard</h2>
<a href="/add-scholarship">Add New Scholarship</a>
<h3>Scholarships List</h3>
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
                    <a href="/update-scholarship/${scholarship.id}">Edit</a> |
                    <a href="/delete-scholarship/${scholarship.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@ include file="footer.jsp" %>

</body>
</html>

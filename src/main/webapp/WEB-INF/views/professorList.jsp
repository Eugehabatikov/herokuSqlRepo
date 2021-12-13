<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<body>

<div class="container">
    <h1>Professor Details</h1>
    <p align="right">
        <button
                onclick="window.location.href = 'showFormForAdd.html'; return false;"
                class="btn btn-primary">Add Professor</button>
    </p>
    <hr />
    <table border="1" class="table table-striped table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>Power ID</th>
            <th>First name</th>
            <th>Second name</th>
        </tr>
        </thead>
        <c:forEach items="${professorList}" var="e">
            <c:url var="updateLink" value="/professor/displayUpdateForm">
                <c:param name="professorId" value="${e.id}" />
            </c:url>

            <c:url var="deleteLink" value="/professor/displayDeleteForm">
                <c:param name="professorId" value="${e.id}" />
            </c:url>
            <tbody>
            <tr>
                <td>${e.powerId}</td>
                <td>${e.fullname}</td>
                <td>${e.secondname}</td>
                <td><a href="${updateLink}">Update</a> | <a
                        href="${deleteLink}"
                        onclick="if(!(confirm('Are you sure want to delete this Professor permanently?'))) return false">Delete</a>
                </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>

</body>
</html>

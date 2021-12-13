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
    <hr />
    <s:form action="saveProcess" modelAttribute="professor">
        <div class="form-group">
            <s:input path="firstName" class="form-control"
                     placeholder="Enter first name" />
        </div>

        <div class="form-group">
            <s:input path="secondName" class="form-control"
                     placeholder="Enter second name" />
        </div>

        <div class="form-group">
            <s:input path="powerId" class="form-control"
                     placeholder="Enter powerId" />
        </div>
    </s:form>
    <hr />
    <a href="listOfProfessor">Back to List</a>
</div>
<script
        src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.1.1.min.js"></script>
</body>
</html>
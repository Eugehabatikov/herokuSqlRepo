<%--
  Created by IntelliJ IDEA.
  User: евгений
  Date: 13.11.2021
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
    File to upload: <input type="file" name="file" >
    <br />
    Name: <input type="text" name="name" >
    <br />
    <br />
    <input type="submit" value="Upload">
</form>
<c:if test="${not empty message}">
    ${message} <!-- here would be a message with a result of processing -->
</c:if>
</body>
</html>

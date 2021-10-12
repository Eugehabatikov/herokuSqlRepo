<%--
  Created by IntelliJ IDEA.
  User: евгений
  Date: 01.09.2021
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%
  String header = "Hello, world!";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>First JSP App</title>
</head>
<body>
<h2><%= header %></h2>
<p>Today <%= new java.util.Date() %></p>
</body>
</html>

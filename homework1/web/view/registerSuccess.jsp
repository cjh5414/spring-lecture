<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 10. 21.
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registraion Success</title>
</head>
<body>
    <h1>You registered successfully.</h1>
    <ul>
        <li>Id: ${customer.id}</li>
        <li>password: ${customer.password}</li>
        <li>gender: ${customer.gender}</li>
        <li>Name: ${customer.name}</li>
        <li>Email: ${customer.email}</li>
    </ul>
    <a href="/helloMVC/index.jsp">go to home page</a>
</body>
</html>

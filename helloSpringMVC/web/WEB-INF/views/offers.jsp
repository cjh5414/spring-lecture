<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 11. 22.
  Time: 오후 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="offer" items="${offers}">
        <p>
            <c:out value="${offer}"/>
        </p>
    </c:forEach>
</body>
</html>

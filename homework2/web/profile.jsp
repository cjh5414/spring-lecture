<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-14
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    ${username} 님 환영합니다.
    <p><a href="<c:url value="/"/>">go to home</a></p>
</body>
</html>

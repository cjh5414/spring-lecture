<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>로그인</title>

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>
<%@ include file="nav.jsp" %>

<div class="container base">
    <h3>Login</h3>
    <c:if test="${not empty logoutMsg}">
        <div class="alert alert-primary" role="alert">
                ${logoutMsg}
        </div>
    </c:if>
    <c:if test="${not empty errorMsg}">
        <div class="alert alert-danger" role="alert">
                ${errorMsg}
        </div>
    </c:if>
    <form action="<c:url value="/login"/>" method="POST">
        <div class="form-group">
            <label for="id_username">ID</label>
            <input type="text" class="form-control" id="id_username" name="username">
        </div>
        <div class="form-group">
            <label for="id_password">Password</label>
            <input type="password" class="form-control" id="id_password" name="password">
        </div>
        <button type="submit" class="btn btn-primary">로그인</button>
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    </form>
</div>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

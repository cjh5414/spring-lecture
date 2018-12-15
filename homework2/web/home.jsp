<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-14
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
    Hello Spring MVC!
    <p><a href="<c:url value="/profile"/>">go to profile</a></p>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <a href="javascript:document.getElementById('logout').submit()"}>logout</a>
    </c:if>

    <form id="logout" action="<c:url value="/logout"/>" method="POST">
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    </form>

    <c:if test="${not empty logoutMsg}">
        <div style="color: #0000FF;">
            <h3> ${logoutMsg}</h3>
        </div>
    </c:if>
</body>
</html>

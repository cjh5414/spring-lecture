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
    <c:choose>
        <c:when test="${pageContext.request.userPrincipal.name != null}">
            <p><a href="<c:url value="/grades"/>">학기별 이수 학점 조회</a></p>
            <p><a href="<c:url value="/register"/>">수강 신청</a></p>
            <p><a href="<c:url value="/registered_courses"/>">수강 신청 조회</a></p>

            <a href="javascript:document.getElementById('logout').submit()"}>logout</a>
        </c:when>
        <c:otherwise>
            <p><a href="<c:url value="/login"/>">로그인</a></p>
        </c:otherwise>
    </c:choose>


    <form id="logout" action="<c:url value="/logout"/>" method="POST">
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    </form>
</body>
</html>

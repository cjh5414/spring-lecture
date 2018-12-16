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

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>

<%@ include file="nav.jsp"%>

<div class="container base">
    <div class="jumbotron">
        <h1 class="display-4">한성대학교 학점 관리 시스템</h1>
        <p class="lead">학년/학기별 이수한 총 학점을 조회할 수 있고 2019년도 1학기 수강신청 및 조회를 할 수 있습니다.</p>
        <hr class="my-4">
        <c:choose>
            <c:when test="${pageContext.request.userPrincipal.name == null}">
                <p class="lead">사용하시려면 로그인을 해주세요.</p>
                <a class="btn btn-primary" href="<c:url value="/login"/>" role="button">로그인</a>
            </c:when>
            <c:otherwise>
                <p class="lead">${username} 님 환영합니다.</p>
            </c:otherwise>
        </c:choose>
    </div>
</div>

<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

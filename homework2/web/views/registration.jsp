<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container base">
    <h2>이수 학점 조회</h2>

    <table class="table">
        <thead>
        <tr>
            <th>수강년도</th>
            <th>학기</th>
            <th>교과코드</th>
            <th>교과목명</th>
            <th>구분</th>
            <th>학점</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.year}</td>
                <td>${course.semester}</td>
                <td>${course.code}</td>
                <td>${course.name}</td>
                <td>${course.section}</td>
                <td>${course.credit}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

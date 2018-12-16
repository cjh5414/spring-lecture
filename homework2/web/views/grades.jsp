<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>총 이수 학점</title>

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>

<%@ include file="nav.jsp" %>

<div class="container base">
    <p>
        <h2>학년/학기별 총 이수 학점 조회</h2>
    </p>
    <table class="table table-sm">
        <thead>
        <tr>
            <th>년도</th>
            <th>학기</th>
            <th>이수 학점</th>
            <th>상세보기</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="grade" items="${grades}">
            <tr>
                <td>${grade.year}</td>
                <td>${grade.semester}</td>
                <td>${grade.credit}</td>
                <td><a href="<c:url value="/registration?year=${grade.year}&semester=${grade.semester}"/>">링크</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    </div>

    <script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

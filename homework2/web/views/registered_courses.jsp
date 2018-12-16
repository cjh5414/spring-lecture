<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>수강 신청 조회</title>
</head>
<body>
    <p>
        <h2>2019년도 1학기 수강 신청 조회</h2>
    </p>

    <table>
        <tr>
            <th>교과코드</th>
            <th>교과목명</th>
            <th>구분</th>
            <th>학점</th>
        </tr>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.code}</td>
                <td>${course.name}</td>
                <td>${course.section}</td>
                <td>${course.credit}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

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
    <title>Grades</title>
</head>
<body>
    <table>
        <tr>
            <th>년도</th>
            <th>학기</th>
            <th>이수 학점</th>
            <th>상세보기</th>
        </tr>
        <c:forEach var="grade" items="${grades}">
            <tr>
                <td>${grade.year}</td>
                <td>${grade.semester}</td>
                <td>${grade.credit}</td>
                <td><a href="<c:url value="/registration?year=${grade.year}&semester=${grade.semester}"/>">링크</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

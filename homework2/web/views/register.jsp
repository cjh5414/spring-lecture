<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>수강신청</title>

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>
<div class="container base">
    <%@ include file="nav.jsp"%>

    <p>
        <h2>2019년도 1학기 수강신청</h2>
    </p>

    <sf:form method="post" action="${pageContext.request.contextPath}/register" modelAttribute="course">
        <div class="form-group">
            <label for="id_title">과목명</label>
            <sf:input type="text" class="form-control" id="id_title" path="name"/>
            <br/>
            <sf:errors class="error" path="name"/>
        </div>
        <div class="form-group">
            <label for="id_code">과목 코드</label>
            <sf:input type="text" class="form-control" id="id_code" path="code"/>
            <br/>
            <sf:errors class="error" path="code"/>
        </div>
        <div class="form-group">
            <label for="id_section">과목 코드</label>
            <sf:input type="text" class="form-control" id="id_section" path="section"/>
            <br/>
            <sf:errors class="error" path="section"/>
        </div>
        <div class="form-group">
            <label for="id_credit">과목 코드</label>
            <sf:input type="number" class="form-control" id="id_credit" path="credit"/>
            <br/>
            <sf:errors class="error" path="credit"/>
        </div>
        <button type="submit" class="btn btn-primary">수강 신청</button>
    </sf:form>
</div>

<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

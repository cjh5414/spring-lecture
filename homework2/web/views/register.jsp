<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>수강신청</title>

    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/static/css/main.css"/>">
</head>
<body>

<%@ include file="nav.jsp" %>

<div class="container base">
    <h2>2019년도 1학기 수강신청</h2>

    <sf:form method="post" action="${pageContext.request.contextPath}/register" modelAttribute="course">
        <div class="formTable">
            <div class="form-group">
                <label for="id_name">과목명</label>
                <sf:input type="text" class="form-control control" id="id_name" path="name"/>
                <div class="errmsg">
                    <sf:errors path="name" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label for="id_code">과목 코드</label>
                <sf:input type="text" class="form-control control" id="id_code" path="code"/>
                <div class="errmsg">
                    <sf:errors path="code" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label for="id_section">구분</label>
                <sf:input type="text" class="form-control control" id="id_section" path="section"/>
                <div class="errmsg">
                    <sf:errors path="section" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label for="id_credit">학점</label>
                <sf:input type="number" class="form-control control" id="id_credit" path="credit"/>
                <div class="errmsg">
                    <sf:errors path="credit" cssClass="error"/>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">수강 신청</button>
        </div>
    </sf:form>
</div>

<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Home</a>

    <div class="navbar-collapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/grades"/>">학기별 이수 학점 조회</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/register"/>">수강 신청</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/registered_courses"/>">수강 신청 조회</a>
            </li>
        </ul>

        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <c:choose>
                    <c:when test="${pageContext.request.userPrincipal.name == null}">
                        <a class="nav-link" href="<c:url value="/login"/>">로그인</a>
                    </c:when>
                    <c:otherwise>
                        <a class="nav-link" href="javascript:document.getElementById('logout').submit()">로그아웃</a>
                    </c:otherwise>
                </c:choose>
            </li>
            <form id="logout" action="<c:url value="/logout"/>" method="POST">
                <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
            </form>
        </ul>
    </div>
</nav>

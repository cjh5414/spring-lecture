<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Login page</title>
</head>
<body>
    <h3>Custom Login Page</h3>
    <form action="<c:url value="/login"/>" method="POST">
        <c:if test="${not empty errorMsg}">
            <div style="color: #FF0000;">
                <h3> ${errorMsg}</h3>
            </div>
        </c:if>
        <table>
            <tr>
                <td>User:</td>
                <td><input type="text" name="username" value=""></td>
            </tr>
            <tr>
                <td>Pssword:</td>
                <td><input type="password" name="password" value=""></td>
            </tr>
            <tr>
                <td colspan="2"><input name="submit" type="submit" value="Login"></td>
            </tr>
            <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
        </table>
    </form>

    <c:if test="${not empty logoutMsg}">
        <div style="color: #0000FF;">
            <h3> ${logoutMsg}</h3>
        </div>
    </c:if>
</body>
</html>

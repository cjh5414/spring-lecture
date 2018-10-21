<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 10. 21.
  Time: 오전 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- JSP Expression Language --%>
    <ul>
        <li>Id: ${customer.id}</li>
        <li>Name: ${customer.name}</li>
        <li>Email: ${customer.email}</li>
    </ul>

    <%-- JSTL --%>
    <table>
        <c:forEach var="customer" items="${customers}" >
            <tr>
                <td> ${customer.id} </td>
                <td> ${customer.name} </td>
                <td> ${customer.email} </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

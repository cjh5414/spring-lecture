<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018-12-15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>수강신청</title>
</head>
<body>
    <p>
        <h2>2019년도 1학기 수강신청</h2>
    </p>

    <sf:form method="post" action="${pageContext.request.contextPath}/register" modelAttribute="course">
        <table>
            <tr>
                <td>과목명: </td>
                <td>
                    <sf:input class="control" type="text" path="name"/>
                    <br/>
                    <sf:errors class="error" path="name"/>
                </td>
            </tr>
            <tr>
                <td>과목 코드: </td>
                <td>
                    <sf:input class="control" type="text" path="code"/>
                    <br/>
                    <sf:errors class="error" path="code"/>
                </td>
            </tr>
            <tr>
                <td>구분: </td>
                <td>
                    <sf:input class="control" type="text" path="section"/>
                    <br/>
                    <sf:errors class="error" path="section"/>
                </td>
            </tr>
            <tr>
                <td>학점: </td>
                <td>
                    <sf:input class="control" type="number" path="credit"/>
                    <br/>
                    <sf:errors class="error" path="credit"/>
                </td>
            </tr>
            <tr><td> </td> <td> <input class="control" type="submit" value="수강 신청"/> </td> </tr>
        </table>
    </sf:form>
</body>
</html>

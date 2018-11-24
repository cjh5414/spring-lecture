<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 11. 24.
  Time: 오후 2:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/doCreate">
        <table class="formTable">
            <tr><td class="label">Name: </td> <td> <input class="control" type="text" name="name"/></td> </tr>
            <tr><td class="label">Email: </td> <td> <input class="control" type="text" name="email"></td> </tr>
            <tr><td class="label">Text: </td> <td> <textarea class="control" name="text" rows="10" cols="10"> </textarea> </td> </tr>
            <tr><td class="label"> </td> <td> <input class="control" type="submit" value="새 제안"/> </td> </tr>
        </table>
    </form>
</body>
</html>

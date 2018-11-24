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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/doCreate">
        <table class="formTable">
            <tr><td>Name: </td> <td> <input type="text" name="name"/></td> </tr>
            <tr><td>Email: </td> <td> <input type="text" name="name"></td> </tr>
            <tr><td>Text: </td> <td> <textarea name="name" rows="10" cols="10"> </textarea> </td> </tr>
            <tr><td> </td> <td> <input type="submit" value="새 제안"/> </td> </tr>
        </table>
    </form>
</body>
</html>

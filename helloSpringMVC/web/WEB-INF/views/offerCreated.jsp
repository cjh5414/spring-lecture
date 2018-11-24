<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 11. 24.
  Time: 오후 4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${offer.name} 가 새로운 제안을 했습니다. 감사합니다 <br/>

    <a href="${pageContext.request.contextPath}/offers"> click here to view current offers</a>
</body>
</html>

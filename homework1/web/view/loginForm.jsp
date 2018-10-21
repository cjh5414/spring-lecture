<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 10. 21.
  Time: 오후 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>

<style>
    div.ex {
        text-align: center;
        width: 35%;
        padding: 10px;
        border: 5px solid grey;
        margin: 20px;
    }
</style>

<body>
    <h1>Login Form</h1>
    <div class="ex">
        <form action="/helloMVC/doLogin" method="post">
            <table cellpadding="5">
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="login"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>

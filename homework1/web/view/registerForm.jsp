<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2018. 10. 21.
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Registration Page</title>
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
<h1>Registration Form</h1>
<div class="ex">
    <form action="/helloMVC/doRegister" method="post">
        <table cellpadding="5">
            <h3> Enter Information Here </h3>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>성별</td>
                <td>
                <input type="radio" name="gender" value="male" checked="checked">남자
                <input type="radio" name="gender" value="female">여자
                </td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="register"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: HAMMAD
  Date: 06-03-2024
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Product By Id</title>
</head>
<body>
<h2> Get product By Id Form</h2>

<form action="http://localhost:8080/servlet_001_war/get product by id" method="post">
    <table>
        <tr>
            <td>Enter Product ID</td>
            <td>< input type="number" name="id"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Get Product By Id"></td>
        </tr>
    </table>
</form>
</body>
</html>

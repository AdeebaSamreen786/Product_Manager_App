<%--
  Created by IntelliJ IDEA.
  User: HAMMAD
  Date: 06-03-2024
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h2> Edit product Form</h2>

<form action="http://localhost:8080/servlet_001_war/edit product" method="post">
    <table>
        <tr>
            <td>Enter Product ID</td>
            <td>< input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Enter product Name</td>
            <td>< input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Enter Product Price</td>
            <td>< input type="number" name="price"></td>
        </tr>
        <tr>
            <td>Enter Product Quantity</td>
            <td>< input type="number" name="quantity"></td>
        </tr>
        <tr>
            <td>Enter Product Review</td>
            <td>< input type="text" name="review"></td>
        </tr>
        <tr>
            <td>Enter Product Customer Ratings</td>
            <td>< input type="text" name="customer ratings"></td>
        </tr>
        <tr>
            <td>Enter Product Discount</td>
            <td>< input type="number" name="discount"></td>
        </tr>
        <tr>
            <td>Enter Product Brand</td>
            <td>< input type="text" name="brand"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Edit Product"></td>
        </tr>
    </table>
</form>
</body>
</html>

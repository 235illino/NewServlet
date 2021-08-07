<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: ilya
  Date: 07.08.21
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>

    <p>Name: <%= cart.getName()%></p>
    <p>Кількість: <%= cart.getQuantity()%></p>
</body>
</html>

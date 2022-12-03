<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28.11.2022
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
Credentials :
First Name -> ${customer.firstName} <br> <br>
Last Name -> ${customer.lastName}<br> <br>
Passes -> ${customer.pass}<br> <br>
Postal Code -> ${customer.postalCode}<br> <br>
Course Code -> ${customer.courseCode}<br> <br>
</body>
</html>

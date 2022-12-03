<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28.11.2022
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
    First Name: <form:input path="firstName"/> <br> <br>
    Last Name (*): <form:input path="lastName"/> <form:errors path="lastName" cssClass="error"/> <br> <br>
    Free Passes: <form:input path="pass"/> <form:errors path="pass" cssClass="error"/> <br> <br>
    Postal Code: <form:input path="postalCode"/> <form:errors path="postalCode" cssClass="error"/> <br> <br>
    Course Code: <form:input path="courseCode"/> <form:errors path="courseCode" cssClass="error"/> <br> <br>
    <input type="submit" value="Gönder">
</form:form>
</body>
</html>

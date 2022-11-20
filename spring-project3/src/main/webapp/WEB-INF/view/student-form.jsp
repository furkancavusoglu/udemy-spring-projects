<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20.11.2022
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/> <br/> <br/>
    Last name : <form:input path="lastName"/> <br/> <br/>
    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <br/> <br/>
    <input type="submit" value="Gönder">
</form:form>
</body>
</html>

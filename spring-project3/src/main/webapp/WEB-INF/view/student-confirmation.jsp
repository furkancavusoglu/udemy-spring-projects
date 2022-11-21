<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20.11.2022
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Process Form</title>
</head>
<body>
<h2>The credentials are ${student.firstName} ${student.lastName} </h2>
<h3>Country: ${student.country}</h3>
<h4>Favorite Language: ${student.favoriteLanguage} </h4>
<h5>Os List :</h5>
<%--<ul>--%>
<%--    <% String[] osList = request.getParameterValues("os");--%>
<%--        for (String os : osList) {--%>
<%--            out.println("<li>" + os + "</li>");--%>
<%--        }%>--%>
<%--</ul>--%>
<ul>
    <c:forEach var="temp" items="${student.os}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>

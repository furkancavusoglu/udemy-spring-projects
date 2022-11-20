<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
<h1>Main Page</h1>
<a href="showForm">Navigate To Form</a>
<br>
<input type="button" onclick="doSomeWork()" value="Click Me"/>
</body>
</html>

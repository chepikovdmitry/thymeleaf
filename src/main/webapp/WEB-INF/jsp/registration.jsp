<%--
  Created by IntelliJ IDEA.
  User: Chepikov_DS
  Date: 24.05.2018
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration page</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/register">
    <input type="text" id="firstName" name="firstName"><br>
    <input type="text" id="lastName" name="lastName"><br>
    <button type="submit">Save</button>
</form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Delwar
  Date: 8/11/2017
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.

  JSP - Java Server Page
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!(welcome.jsp)</title>
</head>

<%-- Creates a link to the form page--%>



<body>
<h1> Welcome Page </h1>

${message} <br />

The line above came from the model, named "message" <br />

<a href = "userform"> Go to the user form</a>
</body>
</html>

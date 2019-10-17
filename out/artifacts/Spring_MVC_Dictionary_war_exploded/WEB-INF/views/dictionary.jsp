<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/17/2019
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/searchWord">
    <h1>Dictionary</h1>
    <div>
        <input type="text" name="txtSearch" id="txtSearch">
        <button type="submit">Search</button>
    </div>
    <div>
        Result: ${vi};
    </div>
</form>
</body>
</html>

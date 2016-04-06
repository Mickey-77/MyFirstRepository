<%--
  Created by IntelliJ IDEA.
  User: tyerwetrw
  Date: 2016/4/1
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>

${users.get(0).uid}
${users.get(0).uname}
<a href="findUser.jsp">ssss</a>
<form action="/enjoy/user/add" method="post">
    uid:  <input type="text" name="uid"/>
    upass:<input type="text" name="uname"/></br>

    <input type="submit" name="s" value="提交" />
</form>

</body>
</html>

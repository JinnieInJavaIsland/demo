<%--
  Created by IntelliJ IDEA.
  User: moneyu50
  Date: 2023-08-01
  Time: 오후 5:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List 화면</h1>


<c:forEach var="item" items="${dtolist}">
    <tr>
        <p>
        <td><a href="/board/read?bno=${item.bno}">No.${item.bno}</a> </td>
        <td>[Title] : ${item.title}</td>
        </p>
    </tr>
</c:forEach>


<button onclick="location.href='/board/register'">Register</button >

</body>
</html>

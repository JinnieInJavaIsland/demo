<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: moneyu50
  Date: 2023-08-02
  Time: 오전 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Read 화면</h1>


    <tr>
    <p><td>Title : ${dto.title}</td></p>
    <p><td>Content : ${dto.content}</td></p>
    <p><td>Date : ${dto.date}</td></p>
    </tr>

<div>
    <button onclick="location.href='/board/list'">List</button >
</div>

<div>
    <button onclick="location.href='/board/delete?bno=${dto.bno}'">Delete</button >
</div>

<div>
    <button onclick="location.href='/board/update?bno=${dto.bno}'">Update</button >
</div>

</body>
</html>

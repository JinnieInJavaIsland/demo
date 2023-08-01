<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<h1>Update 화면</h1>

<form action="/board/update" method="post">

  <div>
    No: <input type="text" name="bno" value="${bno}" readonly>
  </div>

  <div>
    Title: <input type="text" name="title">
  </div>

  <div>
    Content: <input type="text" name="content">
  </div>

  <div>
    <button type="submit">Update</button>
  </div>
</form>

<div>
  <button onclick="location.href='/board/list'">List</button >
</div>


</body>
</html>
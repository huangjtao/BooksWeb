<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stud
  Date: 2019/12/1
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书本清单</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="layui/layui.js"></script>
</head>
<body>

<jsp:include page="book_nav.jsp"></jsp:include>

<table class="layui-table">
    <tr>
        <td>书本ID</td>
        <td>书名</td>
        <td>作者</td>
        <td>书本类型</td>
        <td>价格</td>
        <td>描述</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${booklist}" var="b">
        <tr>
            <td>${b.id}</td>
            <td>${b.bookname}</td>
            <td>${b.author}</td>
            <td>${b.booktype}</td>
            <td>${b.price}</td>
            <td width="400px">${b.detail}</td>
            <td>
                <a href="bookinfoedit?id=${b.id}" class="layui-btn layui-btn-normal layui-btn-radius">
                    <i class="layui-icon layui-icon-edit"></i>
                    修改
                </a>
                <a href="bookinfodelete?id=${b.id}" class="layui-btn layui-btn-danger layui-btn-radius">
                    <i class="layui-icon layui-icon-delete"></i>
                    删除
                </a>
        </tr>
    </c:forEach>

</table>

<jsp:include page="book_footer.jsp"></jsp:include>

</body>
</html>

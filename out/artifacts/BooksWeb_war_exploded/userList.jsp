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
    <title>用户列表</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="layui/layui.js"></script>
    <style>
        /*.layui-search>button{*/
        /*    position: absolute;*/
        /*    right: 5px;*/
        /*}*/
        .layui-bttn > i {
            position: absolute;
            left: 2px;
        }
    </style>
</head>
<body>

<jsp:include page="nav.jsp"></jsp:include>

<%--<c:if test="${sessionScope.loginuser==null}">--%>
<%--    <div><a href="userinfolist">登录</a></div>--%>
<%--</c:if>--%>

<%--//搜索框 搜索功能--%>
<form action="userinfolist" method="post" class="layui-layout-right">
    <div class="layui-form-item" style="margin-top: 15px;">
        <div class="layui-inline">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-inline" style="width: 300px;">
                <input type="text" name="keyword" placeholder="请输入用户名" autocomplete="off"
                       class="layui-input layui-search"/>
            </div>

            <div class="layui-input-inline" style="width: 50px">
                <button class="layui-btn layui-bg-blue layui-bttn"><i class="layui-icon layui-icon-search"></i>搜索
                </button>
            </div>
        </div>
    </div>
</form>

<%--数据展示--%>
<table class="layui-table">
    <tr>
        <td>管理员ID</td>
        <td>管理员用户名</td>
        <td>管理员密码</td>
        <td>管理员头像</td>
        <td>email</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${userlist}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.username}</td>
            <td>${a.password}</td>
            <td><img src="${a.picurl}" width="50"/></td>
            <td>${a.email}</td>
            <td>
                <a href="userinfoedit?id=${a.id}" class="layui-btn layui-btn-normal layui-btn-radius">
                    <i class="layui-icon layui-icon-edit"></i>
                    修改
                </a>
                <a href="userinfodelete?id=${a.id}" class="layui-btn layui-btn-danger layui-btn-radius">
                    <i class="layui-icon layui-icon-delete"></i>
                    删除
                </a>
        </tr>
    </c:forEach>

</table>



<%--<div style="text-align: center;">--%>
<%--    <div class="layui-btn-group">--%>
<%--        <a class="layui-btn layui  layui-btn-primary " href="userinfoPage?p=1">首页</a>--%>
<%--        &lt;%&ndash;    判断是否有上一页&ndash;%&gt;--%>
<%--        <c:if test="${currentPage>1}">--%>
<%--            <a class="layui-btn layui  layui-btn-primary " href="userinfoPage?p=${currentPage-1}">上一页</a>--%>
<%--        </c:if>--%>
<%--        <c:forEach begin="${currentPage-3>1?(currentPage-3):1}"--%>
<%--                   end="${currentPage+3<totalPage?(currentPage+3):totalPage}"--%>
<%--                   var="k">--%>
<%--            &lt;%&ndash;判断是否是当前页    &ndash;%&gt;--%>
<%--            <c:if test="${currentPage==k}">--%>
<%--                <a class="layui-btn layui-btn-danger" href="userinfoPage?p=${k}">${k}</a>--%>
<%--            </c:if>--%>
<%--            &lt;%&ndash;判断是否不是当前页    &ndash;%&gt;--%>
<%--            <c:if test="${currentPage!=k}">--%>
<%--                <a class="layui-btn  layui-btn-primary " href="userinfoPage?p=${k}">${k}</a>--%>
<%--            </c:if>--%>
<%--        </c:forEach>--%>
<%--        &lt;%&ndash;    判断是否有上一页&ndash;%&gt;--%>
<%--        <c:if test="${currentPage<totalPage}">--%>
<%--            <a class="layui-btn  layui-btn-primary " href="userinfoPage?p=${currentPage+1}">下一页</a>--%>
<%--        </c:if>--%>
<%--        <a class="layui-btn layui  layui-btn-primary " href="userinfoPage?p=${totalPage}">尾页</a>--%>
<%--    </div>--%>
<%--</div>--%>


<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>

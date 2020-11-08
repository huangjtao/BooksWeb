<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--公共导航页面--%>

<ul class="layui-nav layui-bg-blue" lay-filter="">
    <li class="layui-nav-item"><a href="bookinfolist">书本列表</a></li>
    <li class="layui-nav-item"><a href="bookAdd.jsp">书本添加</a></li>
    <li class="layui-nav-item"><a href="bookinfolist">书本管理</a></li>
<%--    <li class="layui-nav-item">--%>
<%--        <a href="javascript:;">解决方案</a>--%>
<%--        <dl class="layui-nav-child"> <!-- 二级菜单 -->--%>
<%--            <dd><a href="">移动模块</a></dd>--%>
<%--            <dd><a href="">后台模版</a></dd>--%>
<%--            <dd><a href="">电商平台</a></dd>--%>
<%--        </dl>--%>
<%--    </li>--%>
    <li class="layui-nav-item"><a href="">社区</a></li>
    <li class="layui-nav-item">
        <a href="userinfolist">用户列表</a>
    </li>

<c:if test="${sessionScope.loginuser!=null}">
    <li class="layui-nav-item layui-layout-right
">
        <a href=""><img src="${sessionScope.loginuser.picurl}" class="layui-nav-img">我${sessionScope.loginuser.username}</a>
        <dl class="layui-nav-child">
            <dd><a href="userinfoedit?id=${sessionScope.loginuser.id}">修改信息</a></dd>
            <dd><a href="javascript:;">安全管理</a></dd>
            <dd><a href="loginout">退了</a></dd>
        </dl>
    </li>
</c:if>

</ul>

<script>
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;

        //…
    });
</script>
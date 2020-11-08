<%--
  Created by IntelliJ IDEA.
  User: 27122
  Date: 2019/12/6
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>登录login</title>
    <link rel="stylesheet" href="layui/css/layui.css"/>
    <script type="text/javascript" src="layui/layui.js"></script>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        html {
            height: 100%;
        }

        body {
            height: 100%;
            background: #fff url(img/bg.png) 50% 50% no-repeat;
            background-size: cover;
        }

        .layui-do {
            position: absolute;
            left: 50%;
            top: 50%;
            width: 430px;
            height: 550px;
            margin: -300px 0 0 -215px;
            border: 1px solid #fff;
            border-radius: 20px;
            overflow: hidden;
        }

        .layui-logo {
            width: 104px;
            height: 104px;
            margin: 50px auto 80px;
            background: url(img/login.png) 0 0 no-repeat;
        }

        .form-item {
            position: relative;
            width: 360px;
            margin: 0 auto;
            padding-bottom: 30px;
        }

        .form-item input {
            width: 360px;
            height: 48px;
            padding-left: 70px;
            border: 1px solid #fff;
            border-radius: 25px;
            font-size: 18px;
            color: #fff;
            background-color: transparent;
            outline: none;
        }

        .form-item button {
            width: 360px;
            height: 50px;
            border: 0;
            border-radius: 25px;
            font-size: 18px;
            color: #1f6f4a;
            outline: none;
            cursor: pointer;
            background-color: #fff;
        }

        .tip {
            display: none;
            position: absolute;
            left: 20px;
            top: 52px;
            font-size: 14px;
            color: #f50;
        }

        .layui-reg {
            width: 360px;
            margin: 20px auto 0;
            font-size: 14px;
            overflow: hidden;
        }

        .layui-reg a {
            color: #fff;
            text-decoration: none;
        }

        .layui-reg a:hover {
            text-decoration: underline;
        }

        .layui-reg .reg {
            float: left;
        }

        .layui-reg .forget {
            float: right;
        }

        .layui-do ::-webkit-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .layui-do :-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .layui-do ::-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .layui-do :-ms-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #fff;
        }

        .form-item > i {
            position: absolute;
            left: 20px;
            top: 10px;
        }

        .layui-icon {
            font-size: 30px;
            color: white;
        }

        @media screen and (max-width: 500px) {
            * {
                box-sizing: border-box;
            }

            .layui-do {
                position: static;
                width: auto;
                height: auto;
                margin: 0 30px;
                border: 0;
                border-radius: 0;
            }

            .layui-logo {
                margin: 50px auto;
            }

            .form-item {
                width: auto;
            }

            .form-item input, .form-item button, .layui-reg {
                width: 100%;
            }
        }
    </style>
</head>
<body>


<form class="layui-form" action="loginsubmit" method="post">
    <div class="layui-form-item layui-do">
        <div class="layui-form-item layui-logo"></div>
        <div class="layui-form-item form-item">
            <i class="layui-icon layui-icon-username"></i>
            <input name="username" type="text" required lay-verify="required" autocomplete="off" placeholder="请输入用户名">
            <p class="tip">请输入用户名</p>
        </div>
        <div class="layui-form-item form-item">
            <i class="layui-icon layui-icon-password"></i>
            <input name="password" type="password" required lay-verify="required" autocomplete="off" placeholder="登录密码">
            <p class="tip">用户名或密码不正确</p>
        </div>
        <div class="layui-form-item form-item">
            <button>登 录</button>
        </div>
        <div class="layui-form-item layui-reg">
            <a class="reg" href="userAdd.jsp">立即注册</a>
            <a class="forget" href="javascript:">忘记密码</a>
        </div>
    </div>
</form>
<!--<script src="images/jquery.min.js"></script>
<script>
    $(function () {
        $('input').val('')
        $('#submit').on('click', function () {
            $('.tip').show()
        })
    })
</script>-->


</body>
</html>


<%--<html>--%>
<%--<head>--%>
<%--    <title>登录界面</title>--%>
<%--    <link rel="stylesheet" href="layui/css/layui.css"/>--%>
<%--    <script type="text/javascript" src="layui/layui.js"></script>--%>
<%--    <style>--%>
<%--        .layui-form{--%>
<%--            margin-bottom: 20px;--%>
<%--            text-align: center;--%>
<%--            padding-top: 200px;--%>
<%--        }--%>
<%--        .layui-form-item>i{--%>
<%--            position: absolute;--%>
<%--            padding-top: 5px;--%>
<%--        }--%>
<%--        input{--%>
<%--            height: 30px;--%>
<%--        }--%>
<%--        .layui-body{--%>
<%--            background: url("img/dbg.jpg") no-repeat center center;--%>
<%--        }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body class="layui-body">--%>

<%--<form action="loginsubmit" method="post" class="layui-form">--%>
<%--    <div class="layui-form-item">--%>
<%--    用户名: <i class="layui-icon layui-icon-username"></i><input type="text" name="username" placeholder="请输入用户名"/>--%>
<%--    </div>--%>
<%--    <div class="layui-form-item">--%>
<%--    密码: <i class="layui-icon layui-icon-password" style="color: #0000FF"></i><input type="password" name="password" placeholder="请输入密码"/>--%>
<%--    </div>--%>
<%--    <div class="layui-form-item">--%>
<%--    <button>点我登录</button>--%>
<%--    <button>注册</button>--%>
<%--    </div>--%>
<%--</form>--%>


<%--</body>--%>
<%--</html>--%>

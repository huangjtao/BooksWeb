<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书本修改</title>
    <link rel="stylesheet" href="layui/css/layui.css" />
    <script type="text/javascript" src="layui/layui.js"></script>
    <style>
        .layui-form{
            width: 50%;
            margin-left: 250px;
            text-align: center;
            margin-top: 50px
        }
    </style>
</head>
<body>

<jsp:include page="book_nav.jsp"></jsp:include>

<form class="layui-form" action="bookinfoupdate" method="post" style="width: 50%;">
    <input type="hidden" name="id" value="${book.id}"/>
    <div class="layui-form-item">
        <label class="layui-form-label">书名</label>
        <div class="layui-input-block">
            <input type="text" name="bookname" value="${book.bookname}" required  lay-verify="required" placeholder="请输入书名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">作者</label>
        <div class="layui-input-inline">
            <input type="text" name="author" value="${book.author}" required lay-verify="required" placeholder="请输入作者" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">书本类型</label>
        <div class="layui-input-block">
            <input type="text" name="booktype" value="${book.booktype}" required  lay-verify="required" placeholder="请输入书本类型" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">价格</label>
        <div class="layui-input-block">
            <input type="text" name="price" value="${book.price}" required  lay-verify="required" placeholder="请输入价格" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">描述</label>
        <div class="layui-input-block">
            <input type="text" name="detail" value="${book.detail}" required  lay-verify="required" placeholder="请输入书本描述" autocomplete="open" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;


    });
</script>

<jsp:include page="book_footer.jsp"></jsp:include>

</body>
</html>

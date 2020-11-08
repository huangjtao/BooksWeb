package com.hjt.servlet;

import com.hjt.dao.UserinfoDAO;
import com.hjt.dao.UserinfoDAOImpl;
import com.hjt.pojo.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//管理员注册（添加）操作
@WebServlet("/userinfosave")
public class UserinfoSaveServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收中文时不乱码
        req.setCharacterEncoding("utf-8");
        //接收参数
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String picurl=req.getParameter("picurl");
        String email=req.getParameter("email");
        //将值放入userinfo对象中 封装  a-->对象
        Userinfo a=new Userinfo();
        a.setUsername(username);
        a.setPassword(password);
        a.setPicurl(picurl);
        a.setEmail(email);
        //操作数据库
        UserinfoDAO dao = new UserinfoDAOImpl();
        dao.save(a);

        //页面跳转  重定向
        //resp.sendRedirect("userinfolist");
        req.getRequestDispatcher("login.jsp").forward(req, resp);



    }
}

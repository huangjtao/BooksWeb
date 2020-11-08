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
import java.util.List;

@WebServlet("/userinfolist")
public class UserinfoListServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String keyword=req.getParameter("keyword");


         //调用数据库查询所有信息
        UserinfoDAO dao=new UserinfoDAOImpl();
        List<Userinfo> allist=dao.getAll(keyword);
        //携带参数到页面 （参数名 ，参数值）
        req.setAttribute("userlist",allist);
        //页面跳转
        req.getRequestDispatcher("userList.jsp").forward(req,resp);

    }
}

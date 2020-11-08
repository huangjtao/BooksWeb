package com.hjt.servlet;

import com.hjt.dao.UserinfoDAO;
import com.hjt.dao.UserinfoDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//删除管理员
@WebServlet("/userinfodelete")
public class UserinfoDeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        UserinfoDAO dao=new UserinfoDAOImpl();
        dao.delete(Integer.parseInt(id));
        //页面跳转
        resp.sendRedirect("userinfolist");


    }
}

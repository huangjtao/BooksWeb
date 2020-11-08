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

@WebServlet("/userinfoedit")
public class UserinfoEditServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        UserinfoDAO dao=new UserinfoDAOImpl();
        int uid= Integer.parseInt(id);

        Userinfo a=dao.get(uid);
        req.setAttribute("user",a);

        req.getRequestDispatcher("userEdit.jsp").forward(req,resp);


    }
}

package com.hjt.servlet;

import com.hjt.dao.UserinfoDAO;
import com.hjt.dao.UserinfoDAOImpl;
import com.hjt.pojo.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//处理登录请求
@WebServlet("/loginsubmit")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserinfoDAO dao = new UserinfoDAOImpl();
        Userinfo a = dao.getByName(username);
        if (a == null) {
            req.setAttribute("msg", "用户名不存在");
            req.getRequestDispatcher("loginerror.jsp").forward(req, resp);
            return;
        }
        if (a.getPassword().equals(password)) {
            //session存储 共享参数（登录信息）
            HttpSession session=req.getSession();
            session.setAttribute("loginuser",a);

            resp.sendRedirect("userinfolist");
        }else {
            req.setAttribute("msg", "登录密码不正确");
            req.getRequestDispatcher("loginerror.jsp").forward(req, resp);
            return;
        }

    }
}

package com.hjt.servlet;

import com.hjt.dao.BookinfoDAO;
import com.hjt.dao.BookinfoDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookinfodelete")
public class BookinfoDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id=req.getParameter("id");

        BookinfoDAO dao=new BookinfoDAOImpl();
        dao.delete(Integer.parseInt(id));
        //页面跳转
        resp.sendRedirect("bookinfolist");


    }
}

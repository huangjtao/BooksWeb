package com.hjt.servlet;

import com.hjt.dao.BookinfoDAOImpl;
import com.hjt.pojo.Bookinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookinfoupdate")
public class BookinfoUpdateServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String id=req.getParameter("id");
        String bookname=req.getParameter("bookname");
        String author=req.getParameter("author");
        String booktype=req.getParameter("booktype");
        String price=req.getParameter("price");
        String detail=req.getParameter("detail");

        Bookinfo b = new Bookinfo();
        b.setId(Integer.parseInt(id));
        b.setBookname(bookname);
        b.setAuthor(author);
        b.setBooktype(booktype);
        b.setPrice(price);
        b.setDetail(detail);

        BookinfoDAOImpl dao = new BookinfoDAOImpl();
        dao.update(b);

        //页面跳转  重定向
        resp.sendRedirect("bookinfolist");

    }
}

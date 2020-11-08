package com.hjt.servlet;

import com.hjt.dao.BookinfoDAO;
import com.hjt.dao.BookinfoDAOImpl;
import com.hjt.pojo.Bookinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/bookinfolist")
public class BookinfoListServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BookinfoDAO dao=new BookinfoDAOImpl();
        List<Bookinfo> all = dao.getAll();

        req.setAttribute("booklist",all);
        //页面跳转
        req.getRequestDispatcher("bookList.jsp").forward(req,resp);

    }
}

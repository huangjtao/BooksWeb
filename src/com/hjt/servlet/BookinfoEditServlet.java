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

@WebServlet("/bookinfoedit")
public class BookinfoEditServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        BookinfoDAO dao = new BookinfoDAOImpl();
        int bid= Integer.parseInt(id);

        Bookinfo b = dao.get(bid);
        req.setAttribute("book",b);

        req.getRequestDispatcher("bookEdit.jsp").forward(req,resp);


    }
}

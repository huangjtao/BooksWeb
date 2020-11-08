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

@WebServlet("/userinfoPage")
public class UserinfoPageServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8"); //防止接受中文参数乱码
        String p= req.getParameter("p"); //获取传递过来的页码
        int pageSize=5; //默认每页显示10条
        int pageNum=1; //默认第一页
        if(p!=null){ //如果有页码则转为整数
             pageNum= Integer.parseInt(p);
        }

        UserinfoDAO dao=new UserinfoDAOImpl();
        //调用分页查询
        List<Userinfo> alist= dao.getPage(pageNum,pageSize);
        int nums=dao.count(); //查询数据库总记录数目
        //计算总页数
        int totalPage=nums%pageSize==0 ?(nums/pageSize):(nums/pageSize+1);
        //携带参数到页面  (参数名,参数值)
        req.setAttribute("totalPage",totalPage);
        req.setAttribute("pageSize",pageSize);
        req.setAttribute("currentPage",pageNum);
        req.setAttribute("userlist",alist);
        //页面跳转
        req.getRequestDispatcher("userinfoPage.jsp").forward(req,resp);
    }
}

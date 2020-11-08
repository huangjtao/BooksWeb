package com.hjt.dao;

import com.hjt.pojo.Bookinfo;
import com.hjt.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookinfoDAOImpl implements BookinfoDAO{


    @Override
    public int save(Bookinfo b) {
        int row = 0; //返回执行结果
        try {
            Connection conn = DBUtil.getConn(); //获取连接
            String sql = " insert into bookinfo(id,bookname,author,booktype,price,detail) values(?,?,?,?,?,?) "; //定义sql语句
            PreparedStatement pstm = conn.prepareStatement(sql); //预编译sql语句
            pstm.setInt(1, b.getId()); //绑定第一个参数
            pstm.setString(2, b.getBookname());//绑定第二个参数
            pstm.setString(3, b.getAuthor());//绑定第三个参数
            pstm.setString(4, b.getBooktype());//绑定第四个参数
            pstm.setString(5,b.getPrice());
            pstm.setString(6,b.getDetail());
            row = pstm.executeUpdate(); //获得执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }



    @Override
    public int update(Bookinfo b) {
        int row = 0; //定义返回值
        try {
            Connection conn = DBUtil.getConn();
            //定义修改sql语句
            String sql = "update Bookinfo set bookname=? ,author=? ,booktype=? ,price=? ,detail=? where id=? ";
            //预编译sql语句 处理?
            PreparedStatement pstm = conn.prepareStatement(sql);
            //根据问号?位置绑定参数
            //绑定第一个参数
            pstm.setString(1, b.getBookname());//绑定第二个参数
            pstm.setString(2, b.getAuthor());//绑定第三个参数
            pstm.setString(3, b.getBooktype());//绑定第四个参数
            pstm.setString(4,b.getPrice());
            pstm.setString(5,b.getDetail());
            pstm.setInt(6, b.getId());
            row = pstm.executeUpdate(); //执行操作 并获取执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public int delete(int id) {
        int row = 0; //定义返回值
        try {
            Connection conn = DBUtil.getConn();
            //定义修改sql语句
            String sql = "delete from bookinfo  where id=? ";
            //预编译sql语句 处理?
            PreparedStatement pstm = conn.prepareStatement(sql);
            //根据问号?位置绑定参数
            pstm.setInt(1, id);
            row = pstm.executeUpdate(); //执行操作 并获取执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public List<Bookinfo> getAll() {
        //定义返回值的集合
        List<Bookinfo> userinfoList = new ArrayList<Bookinfo>();
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from Bookinfo "; //查詢sql语句
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Bookinfo b = new Bookinfo();
                b.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                b.setBookname(rs.getString("bookname"));//获取username字段的值赋值给对象
                b.setAuthor(rs.getString("author"));//获取password字段的值赋值给对象
                b.setBooktype(rs.getString("booktype"));//获取picurl字段的值赋值给对象
                b.setPrice(rs.getString("price"));
                b.setDetail(rs.getString("detail"));
                userinfoList.add(b); //添加到集合
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userinfoList;
    }

    @Override
    public Bookinfo get(int id) {
        Bookinfo b = null;
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from Bookinfo where id=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery(); //执行查询 获取返回结果集
            while (rs.next()) {  //移动游标
                b = new Bookinfo();
                b.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                b.setBookname(rs.getString("bookname"));//获取username字段的值赋值给对象
                b.setAuthor(rs.getString("author"));//获取password字段的值赋值给对象
                b.setBooktype(rs.getString("booktype"));//获取picurl字段的值赋值给对象
                b.setPrice(rs.getString("price"));
                b.setDetail(rs.getString("detail"));
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public List<Bookinfo> getPage(int pageNum, int pageSize) {
        return null;
    }
}

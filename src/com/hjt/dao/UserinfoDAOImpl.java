package com.hjt.dao;

import com.hjt.pojo.Userinfo;
import com.hjt.util.DBUtil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//实现AdminInfoDAO中所有的方法操作
public class UserinfoDAOImpl implements UserinfoDAO{
    @Override
    public Userinfo getByName(String username) {
        //
        Userinfo a = null;
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from userinfo where username=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,username);
            ResultSet rs = pstm.executeQuery(); //执行查询 获取返回结果集
            while (rs.next()) {
                a = new Userinfo();
                a.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                a.setUsername(rs.getString("username"));//获取username字段的值赋值给对象
                a.setPassword(rs.getString("password"));//获取password字段的值赋值给对象
                a.setPicurl(rs.getString("picurl"));//获取picurl字段的值赋值给对象
                a.setEmail(rs.getString("email"));
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public int save(Userinfo a) {
        int row = 0; //返回执行结果
        try {
            Connection conn = DBUtil.getConn(); //获取连接
            String sql = " insert into userinfo(id,username,password,picurl,email) values(?,?,?,?,?) "; //定义sql语句
            PreparedStatement pstm = conn.prepareStatement(sql); //预编译sql语句
            pstm.setInt(1, a.getId()); //绑定第一个参数
            pstm.setString(2, a.getUsername());//绑定第二个参数
            pstm.setString(3, a.getPassword());//绑定第三个参数
            pstm.setString(4, a.getPicurl());//绑定第四个参数
            pstm.setString(5,a.getEmail());
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
    public int update(Userinfo a) {
        int row = 0; //定义返回值
        try {
            Connection conn = DBUtil.getConn();
            //定义修改sql语句
            String sql = "update userinfo set username=? ,password=? ,picurl=? ,email=? where id=? ";
            //预编译sql语句 处理?
            PreparedStatement pstm = conn.prepareStatement(sql);
            //根据问号?位置绑定参数
            pstm.setString(1, a.getUsername());
            pstm.setString(2, a.getPassword());
            pstm.setString(3, a.getPicurl());
            pstm.setString(4,a.getEmail());
            pstm.setInt(5, a.getId());
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
            String sql = "delete from userinfo  where id=? ";
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
    public List<Userinfo> getAll(String keyword) {
        //定义返回值的集合
        List<Userinfo> userinfoList = new ArrayList<Userinfo>();
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from Userinfo "; //查詢sql语句
            //判断关键字是否为空
            if (keyword!=null && !keyword.equals("")){
                sql="select * from userinfo where username like '%"+keyword+"%' ";
            }
            //System.out.println("userinfo getAll sql = " + sql);
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Userinfo a = new Userinfo();
                a.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                a.setUsername(rs.getString("username"));//获取username字段的值赋值给对象
                a.setPassword(rs.getString("password"));//获取password字段的值赋值给对象
                a.setPicurl(rs.getString("picurl"));//获取picurl字段的值赋值给对象
                a.setEmail(rs.getString("email"));
                userinfoList.add(a); //添加到集合
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
    public Userinfo get(int id) {
        Userinfo a = null;
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from Userinfo where id=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery(); //执行查询 获取返回结果集
            while (rs.next()) {  //移动游标
                a = new Userinfo();
                a.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                a.setUsername(rs.getString("username"));//获取username字段的值赋值给对象
                a.setPassword(rs.getString("password"));//获取password字段的值赋值给对象
                a.setPicurl(rs.getString("picurl"));//获取picurl字段的值赋值给对象
                a.setEmail(rs.getString("email"));
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public List<Userinfo> getPage(int pageNum, int pageSize) {
        List<Userinfo> userlist=new ArrayList<Userinfo>();
        try {
            Connection conn=DBUtil.getConn();
            String sql="select * from userinfo limit ?,? ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            int start=(pageNum-1)*pageSize; //计算开始值
            pstm.setInt(1,start);
            pstm.setInt(2,pageSize);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String username=rs.getString("username");
                String password=rs.getString("password");
                String picurl=rs.getString("picurl");
                String email=rs.getString("email");
                Userinfo a=new Userinfo(id,username,password,picurl,email);//使用全参构造函数
                userlist.add(a); //放入集合中
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  userlist;
    }

    public int count(){
        //定义返回值的集合
        int nums=0;
        try {
            Connection conn=DBUtil.getConn();
            String sql="select count(*) from userinfo ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            nums=rs.getInt(1);
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nums;
    }

}


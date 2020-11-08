package com.hjt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//数据库连接工具类
public class DBUtil {
    private static String username="root"; //用户名
    private static String pwd="123456";   //密码
    private static String driverClass="com.mysql.jdbc.Driver"; //驱动类名
    private static String url="jdbc:mysql://localhost:3306/db_demo?characterEncoding=utf-8";//连接地址

    public static Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName(driverClass); //加载驱动
        Connection conn= DriverManager.getConnection(url,username,pwd);
        return  conn;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn=DBUtil.getConn();
        System.out.println("conn = " + conn);
    }
}
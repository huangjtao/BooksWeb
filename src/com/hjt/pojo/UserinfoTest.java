package com.hjt.pojo;

import com.hjt.dao.UserinfoDAO;
import com.hjt.dao.UserinfoDAOImpl;

import java.util.List;

public class UserinfoTest {

    public static void main(String[] args) {
        Userinfo a=new Userinfo();



        UserinfoDAO dao=new UserinfoDAOImpl();
//        Userinfo username = dao.getByName("hjt");
//        System.out.println("username = " + username);
//        List<Userinfo> all=dao.getAll("ad");
//        System.out.println("all = " + all);

        List<Userinfo> page = dao.getPage(1, 5);
        int count = dao.count();
        System.out.println("count = " + count);
        System.out.println("page = " + page);


    }
}

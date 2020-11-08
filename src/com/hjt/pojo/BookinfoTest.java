package com.hjt.pojo;

import com.hjt.dao.BookinfoDAO;
import com.hjt.dao.BookinfoDAOImpl;

import java.util.List;

public class BookinfoTest {

    public static void main(String[] args) {

        Bookinfo b=new Bookinfo();

        BookinfoDAO dao=new BookinfoDAOImpl();
        List<Bookinfo> all = dao.getAll();
        System.out.println("all = " + all);

    }


}

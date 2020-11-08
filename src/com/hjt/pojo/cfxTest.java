package com.hjt.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cfxTest {
    public static void main(String[] args) {
        cfx x=new cfx();
        int width=x.width;
        int height=x.height;
        System.out.println("width = " + width);
        System.out.println("height = " + height);

        List<Integer> list=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入列表元素个数：");
        int q=scan.nextInt();
        for (int i = 0; i <q ; i++) {
            System.out.println("请输入需要添加进入列表的第"+(i+1)+"个元素：");
            int w=scan.nextInt();
            list.add(w);
        }

        System.out.println("list = " + list);

    }


}

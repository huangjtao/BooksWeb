package com.hjt.pojo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        cfx c=new cfx();
        int width=c.width;
        int height=c.height;
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        c.width=200;
        System.out.println("width = " + c.width);
        int[] li={1,2,3,4,5,6};
        int row=0;
        for (int i = 0; i < li.length; i++) {

            row+=li[i];
            //System.out.println("row = " + row);
        }
        System.out.println("row = " + row);

        List<Integer> li1=new ArrayList<Integer>();
            li1.add(50);
            li1.add(51);
            li1.add(52);
            //li1.remove(0);
        System.out.println("li1 = " + li1);

        int n=0;
        for (int i = 0; i < li1.size(); i++) {
            System.out.println("li = " + li1.get(i));
            n+=li1.get(i);
        }
        System.out.println("n = " + n);

        for (Integer integer : li1) {
            System.out.println("integer = " + integer);
        }

    }
}

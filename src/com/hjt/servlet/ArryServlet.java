package com.hjt.servlet;

import java.util.Scanner;

public class ArryServlet {
    public static void main(String[] args) {

        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(ns[0] + ns[1]);

        int c = ns[0] > ns[1] ? ns[0] : ns[1];
        System.out.println("c = " + c);

        if (ns[0] > ns[1]) {
            System.out.println(ns[0]);
        } else {
            System.out.println("ns = " + ns[1]);
        }

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("a = " + a);


        int[] arr = {1, 2, 3, 45, 658};
        for (int i = 0; i < arr.length; i++) {
            int row=0;
            row+=arr[i];
            System.out.println("row = " + row);

        }
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println("i1 = " + i1);
        }
    }
}

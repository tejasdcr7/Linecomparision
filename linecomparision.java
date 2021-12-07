package com.bridgelabz.demo;

import java.util.scanner;

public class linecomparision {


        static int length(int x1, int y1, int x2, int y2)
        {

            return Math.sqrt(Math.pow(x2 - x1, 2) +
                    Math.pow(y2 - y1, 2) * 1.0);
        }

        public static void main (String[] args)
        {scanner sc = new scanner(system.in);
            System.out.println("enter the x");
            int num=sc.nextInt();
            System.out.println("enter two x1");
            int num=sc.nextInt();

            System.out.println("enter two y1");
            int num=sc.nextInt();
            System.out.println("enter two y2");
            int num=sc.nextInt();

            System.out.println(Math.round(length(x,x1,y,y1 )*100000.0)/100000.0);
        }
    }


package com.driver;

import com.sun.jdi.connect.Connector;

public class Main {
    public static void main(String [] agrs) {

        Product p = new Product();

        // i just have to call it . not mention print anything in que;
        p.product(10,5);
        p.product(10,10,10);
        p.product(5.0,10.0);

    }

    public static class Product{
        public static int product(int x, int y) {
            return x*y;
        }
        public static int product(int x, int y, int z) {
            return x*y*z;
        }
        public static double product(double x, double y) {
            return x*y;
        }
    }
}
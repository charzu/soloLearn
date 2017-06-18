package com.company;

/**
 * Created by lchar on 17.06.2017.
 */
public class metody {
    private static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int s1, int s2) {
        return s1 + s2;
    }

    static double sum(double s1, double s2) {
        return s1 + s2;
    }


    public static void main(String[] args) {
        hello("Lucas");
        System.out.println(sum(4, 6));
        System.out.println(sum(4.0, 6.4));

    }


}

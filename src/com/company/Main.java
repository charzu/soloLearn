package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("ok");

//        int a = 5;
//        do {
//            a--;
//            System.out.println(a);
//        } while (a > 0);

        int[] arr = {4, 6, 3, 7, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int sum1= 0;
        for (int i =0; i<arr.length; i++){
            sum1+=arr[i];
        }
        System.out.println(sum1);

        int sum2 = 0;
        for (int anArr : arr) { // to jest foreach
            sum2 += anArr;
        }
        System.out.println(sum2);

//         Animal ani = new Animal();
        System.out.println(Math.ceil(11.4));
    }
}

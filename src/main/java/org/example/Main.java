package org.example;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Person vitya = new Person();
        System.out.println(vitya.height);
        vitya.sayName("George");

        Person vlad = new Person();
        vlad.height = 120;
        vlad.weight = 90;
        System.out.println(vlad.height);
        System.out.println(vlad.weight);
        }



        public static int func1 (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
        }

        public static int[] readArray (){
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        return arr;
        }

}
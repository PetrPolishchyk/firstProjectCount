package org.example;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Person vitya = new Person(120, "How are you doing?");
        vitya.sayName("Mr. Vitya");
        System.out.println(vitya.height);
        System.out.println(vitya.phrase);

        Person vlad = new Person();
        vlad.sayName("Mr. Vlad");
        vlad.weight = 90;
        System.out.println(vlad.height);
        System.out.println(vlad.weight);
        System.out.println(vlad.phrase);

        Person dima = new Person(190);
        System.out.println(dima.height);

        Student freshman = new Student(76, "Name is Telon", 1);
        System.out.println(freshman.height + freshman.phrase + freshman.course);
        freshman.tell();
        }


        //functions
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